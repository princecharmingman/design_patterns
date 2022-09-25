package com.tw.design_patterns.factory.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void test() {
        PhoneFactory factory = new HonorPhoneFactory();
        PhoneStore store = new PhoneStore();
        store.setFactory(factory);
        Phone phone = store.bookPhone();
        System.out.println(phone.getName());
        assertEquals("荣耀手机", phone.getName());
    }
}
