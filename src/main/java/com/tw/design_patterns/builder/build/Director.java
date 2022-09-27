package com.tw.design_patterns.builder.build;

public class Director {

    private PhoneBuilder builder;

    public Director(PhoneBuilder builder) {
        this.builder = builder;
    }

    public Phone construct() {
        builder.buildCpu();
        builder.buildScreen();
        return builder.producePhone();
    }
}
