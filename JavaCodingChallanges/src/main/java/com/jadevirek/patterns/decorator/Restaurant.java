package main.java.com.jadevirek.patterns.decorator;

import java.text.DecimalFormat;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        PizzaBase margherita = new PizzaBase();
        PizzaBase withMozzarella = new PizzaWithMozzarella(margherita);
       // PizzaBase withMozzarellaAndHam = new PizzaWithHam(withMozzarella);
      //  PizzaBase withMozzarellaHamAndBasil = new PizzaWithBasil(withMozzarellaAndHam);

        DecimalFormat df = new DecimalFormat("#,00 zł");
        for (PizzaBase pizza : List.of(margherita, withMozzarella)) {
            System.out.println(String.format("%s costs %s.", pizza, df.format(pizza.getPrice())));
        }
    }
}
