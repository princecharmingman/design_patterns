package com.tw.design_patterns.builder.build;


import org.junit.jupiter.api.Test;

public class PhoneBuilderTest {
    @Test
    public void test() {
        Director director = new Director(new HuaWeiPhoneBuilder());
        Phone phone = director.construct();
        System.out.println(phone.getCpu());
        System.out.println(phone.getScreen());
    }
}
