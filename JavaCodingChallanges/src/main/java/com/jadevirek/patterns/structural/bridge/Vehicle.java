package main.java.com.jadevirek.patterns.structural.bridge;


/**
 *
 */
abstract class Vehicle {
    protected IWorkShop w1;
    protected IWorkShop w2;

    protected Vehicle(IWorkShop w1, IWorkShop w2)
    {
        this.w1 = w1;
        this.w2 = w2;
    }

    abstract public void manufacture();
}
