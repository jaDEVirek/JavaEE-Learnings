package main.java.com.jadevirek.patterns.structural.bridge;

//Concrete implementation 1 for bridge pattern
class Produce implements IWorkShop {
    @Override public void work()
    {
        System.out.print("Producing vehicle");
    }
}
