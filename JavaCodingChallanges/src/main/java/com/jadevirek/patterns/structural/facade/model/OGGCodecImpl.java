package main.java.com.jadevirek.patterns.structural.facade.model;


import main.java.com.jadevirek.patterns.structural.facade.ICodec;

public class OGGCodecImpl implements ICodec {
    private final String type = "ogg";

    public String getType() {
        return type;
    }

}
