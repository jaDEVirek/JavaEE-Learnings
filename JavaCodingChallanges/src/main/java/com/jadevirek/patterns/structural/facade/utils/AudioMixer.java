package main.java.com.jadevirek.patterns.structural.facade.utils;

import main.java.com.jadevirek.patterns.structural.facade.VideoFile;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
