package com.company;

public class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {
        System.out.println("New Instance Created");
    }

    public static final Logger getInstance() {
        return INSTANCE;
    }
}
