package com.jadevirek.action;

import com.jadevirek.service.ServiceDataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SetUpAction {

    private String name = "its a final name ! ";
    private List<String> usersFromService = new ArrayList<>();
    private final Logger classLogger = Logger.getLogger(SetUpAction.class.getName());

    public String execute() throws Exception {
        usersFromService = ServiceDataProvider.prepareStoredUsers();
        usersFromService.add(name);
        logActionWithMassage("Added name " + name);
        logActionWithMassage("Data:" + getUsersFromService());
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void logActionWithMassage(String massage) {
        classLogger.log(Level.INFO, massage);
    }

    public List<String> getUsersFromService() {
        return usersFromService;
    }
}

