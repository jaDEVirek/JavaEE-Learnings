package main.java.com.jadevirek.patterns.structural.facade.model;


import main.java.com.jadevirek.patterns.structural.facade.ICodec;

public class MPEG4CodecImpl implements ICodec {

    private final String type = "mp4";

    public String getType() {
        return type;
    }
}
