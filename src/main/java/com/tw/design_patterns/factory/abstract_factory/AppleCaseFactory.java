package com.tw.design_patterns.factory.abstract_factory;


public class AppleCaseFactory extends CaseFactory {

    public ApplePhoneCase producePhoneCase() {
        return new ApplePhoneCase();
    }

}
