package com.tw.design_patterns.singleton.lazy;

public class Singleton {

    private Singleton() {
    }

    private static Singleton single;

    public static synchronized Singleton getInstance() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

}