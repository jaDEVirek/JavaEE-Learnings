package com.jadevirek;


import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class MainServerStarter {
    public static void main(String[] args) {

        RouterFunction<ServerResponse> route = route(GET("/"), request -> ServerResponse.ok()
                .body(fromValue("Hello")));

        HttpServer server = HttpServer.create()
                .host("localhost")
                .port(8080);

        HttpHandler httpHandler = RouterFunctions.toHttpHandler(route);
        server.handle(new ReactorHttpHandlerAdapter(httpHandler))
                .bindNow();
    }
}
