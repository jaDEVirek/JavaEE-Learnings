package main.java.com.jadevirek.patterns.creational.factory;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
