package com.tw.design_patterns.builder.build;

public abstract class PhoneBuilder {

    protected Phone phone = new Phone();

    public abstract void buildCpu();

    public abstract void buildScreen();

    public abstract Phone producePhone();
}
