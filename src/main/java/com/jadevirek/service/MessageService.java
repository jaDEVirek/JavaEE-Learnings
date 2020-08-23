package com.jadevirek.service;


import com.jadevirek.response.Massage;
import com.jadevirek.response.Topic;
import io.vavr.collection.Map;
import io.vavr.control.Option;
import reactor.util.annotation.Nullable;

/**
 *
 */
public class MessageService {

    private Map<String, Topic> topics;


    public Option<Topic> getTopicByName(String topicName) {
        return topics.get(topicName);
    }

    public void addMessageToTopic(String topicName, @Nullable Massage massage) {
        topics.get(topicName)
                .map(topic -> topic.addMessageToTopic(massage));
    }

    public void createNewTopic(String topicName) {

    }
}
