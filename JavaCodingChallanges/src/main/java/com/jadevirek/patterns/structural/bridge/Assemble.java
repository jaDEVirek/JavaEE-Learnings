package main.java.com.jadevirek.patterns.structural.bridge;


//Concrete implementation 2 for bridge pattern
public class Assemble implements IWorkShop {
    @Override public void work() {
        System.out.println("Assembing Vehicle.");
    }
}
