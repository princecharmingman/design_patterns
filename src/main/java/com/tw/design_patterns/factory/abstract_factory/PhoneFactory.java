package com.tw.design_patterns.factory.abstract_factory;


public abstract class PhoneFactory implements Phone3CFactory {

    public abstract Phone producePhone();

    public PhoneCase producePhoneCase() {
        return null;
    }

}
