package com.tw.design_patterns.factory.abstract_factory;


public class HonorCaseFactory extends CaseFactory {
    public HonorPhoneCase producePhoneCase() {
        return new HonorPhoneCase();
    }
}
