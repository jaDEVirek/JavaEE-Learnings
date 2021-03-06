package com.jadevirek;


import com.jadevirek.model.Massage;
import com.jadevirek.service.ForumContentService;
import io.vavr.collection.List;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.netty.http.server.HttpServer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class MainServerStarter {
    private static List<Massage> massages = List.empty();
    private final ForumContentService serviceContent;

    public static void main(String[] args) {
//        RouterFunction<ServerResponse> route = getRouteResponse();
        new MainServerStarter().runServerWithRoute(getRouteResponse());

    }

    /**
     * On call - init massages
     */
    public MainServerStarter() {
        syncAddMessage(new Massage("Rejestrator1", "Pierwsze słowa"));
        serviceContent= new ForumContentService();
    }

    private static RouterFunction<ServerResponse> getRouteResponse() {
        return nest(path("/api"),
                route(GET("/time"), renderTime())
                        .andRoute(GET("/massages"), renderMessages())
                        .andRoute(POST("/massage"), postNewMassage()));
    }

    private static HandlerFunction<ServerResponse> postNewMassage() {
        return request -> {
            // Mono promise for single value
            Mono<Massage> postedMassage = request.bodyToMono(Massage.class);
            return postedMassage.flatMap(msg -> {
                syncAddMessage(msg);
                return ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(fromValue(massages.toJavaList()));
            });
        };
    }

    /**
     * Just for only one thread until work will be done
     *
     * @param msg
     */
    private static synchronized void syncAddMessage(Massage msg) {
        massages = massages.append(msg);
    }

    private static HandlerFunction<ServerResponse> renderMessages() {
        return request -> ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromValue(massages.toJavaList()));

    }

    private static HandlerFunction<ServerResponse> renderTime() {
        return request -> ServerResponse.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(fromValue(LocalDateTime.now()
                        .format(DateTimeFormatter.ISO_LOCAL_DATE)));
    }

    private void runServerWithRoute(RouterFunction<ServerResponse> route) throws NullPointerException {
        HttpServer server = HttpServer.create()
                .host("localhost")
                .port(9090);
        HttpHandler httpHandler = RouterFunctions.toHttpHandler(route);
        Objects.requireNonNull(server.handle(new ReactorHttpHandlerAdapter(httpHandler))
                .bind()
                .block())
                .onDispose()
                .block();
    }

    /**
     * Synchronized threads when server call the resources of messages
     * @return
     */
    private synchronized List<Massage> getSyncMessage() {
        return massages;
    }
}
