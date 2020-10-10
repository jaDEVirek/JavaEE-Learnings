package main.java.com.jadevirek.patterns.proxy;

import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject {

    private final static Logger LOG = Logger.getLogger(ExpensiveObjectImpl.class.getName());

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        LOG.info("processing complete.");
    }

    private void heavyInitialConfiguration() {
        LOG.info("Loading initial configuration...");
    }
}
