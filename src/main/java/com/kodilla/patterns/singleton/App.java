package com.kodilla.patterns.singleton;

public class App {
    public static void main(String[] args) {

        Logger.INSTANCE.log("cwks");
        Logger.INSTANCE.log("hello");
        System.out.println(Logger.INSTANCE.getLastLog());
    }
}
