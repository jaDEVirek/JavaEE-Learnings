package main.java.com.jadevirek.patterns.creational.factory;

/**
 * HTML button implementation.
 */
public class HtmlButton implements IButton {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
