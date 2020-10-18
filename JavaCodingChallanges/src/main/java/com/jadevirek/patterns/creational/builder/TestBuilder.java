package main.java.com.jadevirek.patterns.creational.builder;


/**
 *
 */
public class TestBuilder {
    public static void main(String[] args) {

        IComputerBuilder computer = new ComputerBuilderImpl();


        Computer buildedComputer = computer.build();

    }
}
