package com.tw.design_patterns.factory.simple_factory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void test() {
        PhoneStore store = new PhoneStore();
        Phone phone = store.bookPhone("apple");
        System.out.println(phone.getName());
        assertEquals("苹果手机", phone.getName());
    }
}
