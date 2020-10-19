package main.java.com.jadevirek.patterns.creational.builder;

public class ComputerBuilderImpl implements IComputerBuilder {

    Computer computer;

    public ComputerBuilderImpl() {
        this.computer = new Computer();
    }

    @Override public Computer build() {
        return this.computer;
    }

    @Override public IComputerBuilder setHdd(String hdd) {
        computer.setHDD(hdd);
        return this;
    }

    @Override public IComputerBuilder setRAM(String ram) {
        computer.setRAM(ram);
        return this;
    }

    @Override public IComputerBuilder setGraphicCard(String graphicCardName) {
        if (computer.isDedicatedHraphicCardEnabled()) {
            computer.setGraphicCard(graphicCardName);
        } else {
            computer.setGraphicCard("None");
        }
        return this;
    }

    @Override public IComputerBuilder setProcessor(String processor) {
        computer.setProcessor(processor);
        return this;
    }

    @Override public IComputerBuilder setIntegratedCard(String cardName) {
        computer.setIntegratedCard(cardName);
        return this;
    }

    @Override public IComputerBuilder enableGraphicCard(boolean isEnabled) {
        computer.setDedicatedGraphicCardEnabled(isEnabled);
        return this;

    }

    @Override public IComputerBuilder enableBluetooth(boolean isEnabled) {
        computer.setBluetoothEnabled(isEnabled);
        return this;
    }
}
