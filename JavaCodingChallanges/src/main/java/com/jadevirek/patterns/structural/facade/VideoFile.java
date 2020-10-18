package main.java.com.jadevirek.patterns.structural.facade;


/**
 * POJO model class- for facade pattern example in Java
 */
public class VideoFile {

    private String fileName;
    private String codecType; 


    public VideoFile(String fileName) {
        this.fileName = fileName;
        this.codecType = fileName.substring(fileName.indexOf('.')+1);
    }

    public String getFileName() {
        return fileName;
    }

    public String getCodecType() {
        return codecType;
    }
}
