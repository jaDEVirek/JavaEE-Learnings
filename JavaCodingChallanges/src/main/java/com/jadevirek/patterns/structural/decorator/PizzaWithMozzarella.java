package main.java.com.jadevirek.patterns.structural.decorator;

import java.math.BigDecimal;

public class PizzaWithMozzarella extends PizzaBase {
    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);
    private final PizzaBase basePizza;

    public PizzaWithMozzarella(PizzaBase basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(MOZZARELLA_PRICE);
    }
}
