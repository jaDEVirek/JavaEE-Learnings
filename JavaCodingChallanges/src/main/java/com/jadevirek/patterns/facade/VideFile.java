package main.java.com.jadevirek.patterns.facade;


/**
 * POJO model class- for facade pattern example in Java
 */
public class VideFile {

    private String fileName;
    private String fileType;
    private String codecType;


    public VideFile(String fileName, String fileType, String codecType) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.codecType = codecType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getCodecType() {
        return codecType;
    }

    public void setCodecType(String codecType) {
        this.codecType = codecType;
    }
}
