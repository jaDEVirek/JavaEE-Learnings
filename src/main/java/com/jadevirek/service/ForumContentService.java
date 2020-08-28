package com.jadevirek.service;


import com.jadevirek.model.Massage;
import com.jadevirek.model.Topic;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import io.vavr.control.Option;
import reactor.util.annotation.Nullable;

/**
 *
 */
public class ForumContentService {

    private Map<String, Topic> topics;


    public ForumContentService() {
        this.topics = initBasicContent();
    }

    public synchronized Option<Topic> getTopicByName(String topicName) {
        return topics.get(topicName);
    }

    public synchronized Option<Topic> addMessageToTopic(String topicName, @Nullable Massage massage) {
        Option<Topic> updatedTopic = this.topics.get(topicName)
                .map(topic -> topic.addMessage(massage));
        updatedTopic.map(uT -> this.topics.put(topicName, uT))
                .forEach(mapOfTopic -> this.topics = mapOfTopic);
        return updatedTopic;
    }

    public void createNewTopic(String topicName) {

    }

    private static Map<String, Topic> initBasicContent() {
        return List.of("Java", "javaScript", "Wzorce Projektowe")
                .map(Topic::createTopic)
                .toMap(Topic::getName, topic -> topic);
    }
}
