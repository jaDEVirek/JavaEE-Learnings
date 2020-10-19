package main.java.com.jadevirek.patterns.creational.builder;

public class Computer {
    //required parameters
    private String HDD = null;
    private String RAM = null;
    private String processor = null;
    private String graphicCard = null;
    private String integratedCard = null;

    //optional parameters
    private boolean isDedicatedHraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setIntegratedCard(String integratedCard) {
        this.integratedCard = integratedCard;
    }

    public void setDedicatedGraphicCardEnabled(boolean dedicatedHraphicCardEnabled) {
        isDedicatedHraphicCardEnabled = dedicatedHraphicCardEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getIntegratedCard() {
        return integratedCard;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isDedicatedHraphicCardEnabled() {
        return isDedicatedHraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", processor='" + processor + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", integratedCard='" + integratedCard + '\'' +
                ", isDedicatedHraphicCardEnabled=" + isDedicatedHraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
