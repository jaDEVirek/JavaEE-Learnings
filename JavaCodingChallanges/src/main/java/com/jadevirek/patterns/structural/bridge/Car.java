package main.java.com.jadevirek.patterns.structural.bridge;

// Refine abstraction 1 in bridge pattern
class Car extends Vehicle {
    public Car(IWorkShop w1, IWorkShop w2) {
        super(w1, w2);
    }

    @Override public void manufacture() {
        System.out.print("Car ");
        w1.work();
        w2.work();
    }

}
