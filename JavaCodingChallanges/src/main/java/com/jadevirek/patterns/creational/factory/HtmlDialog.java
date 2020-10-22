package main.java.com.jadevirek.patterns.creational.factory;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}
