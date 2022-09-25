package com.tw.design_patterns.factory.factory_method;


public class HonorPhoneFactory implements PhoneFactory {

    public Phone producePhone() {
        return new HonorPhone();
    }
}
