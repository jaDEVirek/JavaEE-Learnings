package com.jadevirek.action;

import com.opensymphony.xwork2.Action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class GetStringAction   {

    private InputStream stringName;

    public String execute() {
        stringName = new ByteArrayInputStream(
                "some string2edee".getBytes(StandardCharsets.UTF_8));
        return Action.SUCCESS;
    }

    public InputStream getInputStream() {
        return stringName;
    }

    public void setInputStream(InputStream stringName) {
        this.stringName = stringName;
    }
}
