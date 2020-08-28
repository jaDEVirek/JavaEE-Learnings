package com.jadevirek.model;

import io.vavr.collection.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Topic {
    private final String name;

    private final List<Massage> messages;

    private Topic(@NotBlank String name, @NotNull List<Massage> messages) {
        this.name = name;
        this.messages = messages;
    }

    public static Topic createTopic(String topicName) {
        return new Topic(topicName, List.empty());
    }

    public Topic addMessage(Massage message) {
        return new Topic(this.name, this.messages.prepend(message));
    }

    public String getName() {
        return name;
    }
}
