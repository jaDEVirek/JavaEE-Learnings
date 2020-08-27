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


    MessageService() {

    }

    public Option<Topic> getTopicByName(String topicName) {
        return topics.get(topicName);
    }

    public Option<Topic> addMessageToTopic(String topicName, @Nullable Massage massage) {
        Option<Topic> updatedTopic = this.topics.get(topicName)
                .map(topic -> topic.addMessage(massage));
        updatedTopic.map(uT -> this.topics.put(topicName, uT))
                .forEach(mapOfTopic -> this.topics = mapOfTopic);
        return updatedTopic;
    }

    public void createNewTopic(String topicName) {

    }
}
