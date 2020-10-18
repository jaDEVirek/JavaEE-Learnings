package main.java.com.jadevirek.patterns.structural.facade.utils;

import main.java.com.jadevirek.patterns.structural.facade.ICodec;
import main.java.com.jadevirek.patterns.structural.facade.VideoFile;

public class BitrateReader {
    public static VideoFile read(VideoFile file, ICodec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, ICodec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
