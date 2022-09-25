package com.tw.design_patterns.factory.simple_factory;


public class PhoneStore {

    public Phone bookPhone(String type) {
        SimplePhoneFactory factory = new SimplePhoneFactory();
        return factory.producePhone(type);
    }
}
