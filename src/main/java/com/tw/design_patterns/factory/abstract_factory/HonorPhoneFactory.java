package com.tw.design_patterns.factory.abstract_factory;


public class HonorPhoneFactory extends PhoneFactory {

    public Phone producePhone() {
        return new HonorPhone();
    }

}
