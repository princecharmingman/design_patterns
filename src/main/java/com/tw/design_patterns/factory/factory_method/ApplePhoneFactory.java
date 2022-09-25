package com.tw.design_patterns.factory.factory_method;

public class ApplePhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new ApplePhone();
    }
}
