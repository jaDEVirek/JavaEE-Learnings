package com.jadevirek.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Massage {

    private String author;
    private String content;

    @JsonCreator
    public Massage(@JsonProperty("author") String author,
            @JsonProperty("content") String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
