package main.java.com.jadevirek.patterns.facade.model;

import main.java.com.jadevirek.patterns.facade.ICodec;

public class Mp3CodecImpl implements ICodec {
    private final String type = "mp3";

    public String getType() {
        return type;
    }
}
