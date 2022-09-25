package com.tw.design_patterns.singleton.double_check;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainTest {


    @Test
    public void test() throws Exception {
        Class<Singleton> objectClass = Singleton.class;
        Constructor<Singleton> constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = constructor.newInstance();
        System.out.println(instance == instance2);
    }


}
