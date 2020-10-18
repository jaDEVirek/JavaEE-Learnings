package main.java.com.jadevirek.patterns.structural.facade;

import main.java.com.jadevirek.patterns.structural.facade.model.MPEG4CodecImpl;
import main.java.com.jadevirek.patterns.structural.facade.model.Mp3CodecImpl;
import main.java.com.jadevirek.patterns.structural.facade.model.OGGCodecImpl;

/**
 *
 */
public class CodecFactory {

    public static ICodec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CodecImpl();
        } else if (type.equals("mp3")) {
            System.out.println("CodecFactory: extracting mp3 audio...");
            return new Mp3CodecImpl();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OGGCodecImpl();
        }
    }
}

