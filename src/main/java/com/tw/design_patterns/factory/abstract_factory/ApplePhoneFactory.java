package com.tw.design_patterns.factory.abstract_factory;


public class ApplePhoneFactory extends PhoneFactory {

    public Phone producePhone() {
        return new ApplePhone();
    }

}
