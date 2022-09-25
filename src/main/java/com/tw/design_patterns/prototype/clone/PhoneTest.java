package com.tw.design_patterns.prototype.clone;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PhoneTest {

    @Test
    public void test1() throws CloneNotSupportedException {
        Person person = new Person();
        Phone phone = new Phone();
        phone.setBrand("苹果");
        person.setPhone(phone);

        Person person1 = person.clone();

        assertSame(phone, person1.getPhone());
    }

}
