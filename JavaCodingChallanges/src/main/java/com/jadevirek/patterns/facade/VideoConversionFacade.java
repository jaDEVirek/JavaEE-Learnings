package main.java.com.jadevirek.patterns.facade;

import main.java.com.jadevirek.patterns.facade.model.MPEG4CodecImpl;
import main.java.com.jadevirek.patterns.facade.model.OGGCodecImpl;
import main.java.com.jadevirek.patterns.facade.utils.AudioMixer;
import main.java.com.jadevirek.patterns.facade.utils.BitrateReader;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        ICodec sourceCodec = CodecFactory.extract(file);
        ICodec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OGGCodecImpl();
        } else {
            destinationCodec = new MPEG4CodecImpl();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
