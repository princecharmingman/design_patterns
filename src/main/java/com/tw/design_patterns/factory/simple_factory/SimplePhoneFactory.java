package com.tw.design_patterns.factory.simple_factory;


public class SimplePhoneFactory {

    public Phone producePhone(String type) {
        Phone phone = null;
        if("honor".equals(type)) {
            phone = new HonorPhone();
        } else if("apple".equals(type)) {
            phone = new ApplePhone();
        } else {
            throw new RuntimeException("对不起，暂无此款手机");
        }

        return phone;
    }
}
