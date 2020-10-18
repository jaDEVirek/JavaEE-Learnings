package main.java.com.jadevirek.patterns.creational.builder;


/**
 * Abstract interface to build Computer based on client properites
 */
public interface IComputerBuilder {

    Computer build();

    IComputerBuilder setHdd(final String hdd);

    IComputerBuilder setRAM(final String ram);

    IComputerBuilder setGraphicCard(final String graphicCardName);

    IComputerBuilder setProcessor(final String processor);

    IComputerBuilder setIntegratedCard(final String cardName);

    IComputerBuilder enableGraphicCard(final boolean isEnabled);

    IComputerBuilder enableBluetooth(final boolean isEnabled);


}
