package main.java.com.jadevirek.patterns.proxy;

/**
 * Simple class present proxy pattern in Java
 *   Runner and show result
 */
public class ProxyPatternExpl {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}

/**
 *  Duty classes
 */
class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
