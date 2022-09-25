package com.tw.design_patterns.singleton.enums;


import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainTest {

    @Test
    public void test() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Singleton> objectClass = Singleton.class;
        Constructor<Singleton> constructor = objectClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = constructor.newInstance("INSTANCE", 0);
        System.out.println(instance == instance2);
    }


}
