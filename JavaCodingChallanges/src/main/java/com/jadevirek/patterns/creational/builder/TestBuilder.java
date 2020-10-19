package main.java.com.jadevirek.patterns.creational.builder;


/**
 *
 */
public class TestBuilder {
    public static void main(String[] args) {

        IComputerBuilder computer = new ComputerBuilderImpl();
        computer.enableBluetooth(false)
                .enableGraphicCard(true)
                .setGraphicCard("NVIDIA")
                .setProcessor("Intel")
                .setHdd("SATA ")
                .setRAM("6400")
                .setIntegratedCard("Intel 4400");

        Computer buildedComputer = computer.build();

        System.out.println(buildedComputer.toString());
    }
}
