package main.java.com.jadevirek.patterns.facade.utils;

import main.java.com.jadevirek.patterns.facade.ICodec;
import main.java.com.jadevirek.patterns.facade.VideoFile;

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
