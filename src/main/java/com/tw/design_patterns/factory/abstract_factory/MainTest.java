package com.tw.design_patterns.factory.abstract_factory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void test() {
        HonorPhoneFactory factory = new HonorPhoneFactory();
        Phone phone = factory.producePhone();
        CaseFactory caseFactory = new HonorCaseFactory();
        PhoneCase phoneCase = caseFactory.producePhoneCase();
        System.out.println(phone.getName());
        phoneCase.protect();
        assertEquals("荣耀手机", phone.getName());
    }

}
