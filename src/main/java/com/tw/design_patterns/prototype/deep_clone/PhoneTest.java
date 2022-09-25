package com.tw.design_patterns.prototype.deep_clone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PhoneTest {

    @Test
    public void test() {
        Person person = new Person();
        Phone phone = new Phone();
        person.setPhone(phone);
        Person person1 = CloneUtils.getDeepCloneObject(person);

        assertNotSame(person, person1);
        assertNotSame(phone, person1.getPhone());
    }
}
