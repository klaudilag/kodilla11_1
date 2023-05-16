package com.kodilla.patterns.singleton;

public enum Logger {
    ;
    private static String LAST_LOG;

    public static void log(String log) {
        LAST_LOG = log;
        System.out.println("Log: [" + log + "]");
    }

    public static String getLastLog() {
        return LAST_LOG;
    }

    Logger() {
    }
}
