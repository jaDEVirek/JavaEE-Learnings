package main.java.com.jadevirek.patterns.decorator;

import java.math.BigDecimal;

public class PizzaBase {

    private static final BigDecimal BASE_PRICE = new BigDecimal(12);
    private static String doughType;
    private static String size;

    public BigDecimal getPrice() {
        return BASE_PRICE;
    }

    @Override
    public String toString() {
        return "Pizza";
    }
}
