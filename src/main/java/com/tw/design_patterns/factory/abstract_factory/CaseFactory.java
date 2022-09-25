package com.tw.design_patterns.factory.abstract_factory;


public abstract class CaseFactory implements Phone3CFactory {

    public abstract PhoneCase producePhoneCase();

    public Phone producePhone() {
        return null;
    }

}
