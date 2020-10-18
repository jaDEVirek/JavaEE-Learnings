package main.java.com.jadevirek.patterns.structural.bridge;

//Refine abstraction 2 in bridge pattern
class Bike extends Vehicle {
    public Bike(IWorkShop w1, IWorkShop w2) {
        super(w1, w2);
    }

    @Override public void manufacture() {
        System.out.print("Bike ");
        w1.work();
        w2.work();
    }
}
