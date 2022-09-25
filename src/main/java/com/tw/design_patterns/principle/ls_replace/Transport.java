package com.tw.design_patterns.principle.ls_replace;


import org.junit.jupiter.api.Test;

public class Transport {
    int spendTime;

    public void setSpendTime() {
        this.spendTime = 1;
    }

    public int getSpeed(int distance) {
        return (distance / spendTime);
    }
}


class Car extends Transport {
}


class Bike extends Transport {
    @Override
    public void setSpendTime() {
        this.spendTime = 0;
    }
}

class LsReplaceTest {
    @Test
    public void test() {
        Car car = new Car();
        Bike bike = new Bike();
        car.setSpendTime();
        bike.setSpendTime();
        try {
            System.out.println("车的速度是" + car.getSpeed(300) + "m/h.");
            System.out.println("自行车的速度是" + bike.getSpeed(300) + "m/h.");
        } catch (Exception e) {
            System.out.println("出问题了!");
        }
    }
}