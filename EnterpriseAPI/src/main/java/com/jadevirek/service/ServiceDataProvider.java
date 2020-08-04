package com.jadevirek.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ServiceDataProvider {

    private static List<String> storedUsers = new ArrayList<>();

    public static List<String> prepareStoredUsers() {
        ServiceDataProvider.initData();
        return storedUsers;
    }

    private static boolean initData() {
        return storedUsers.addAll(Arrays.asList("User1", "User2", "User3"));
    }
}
