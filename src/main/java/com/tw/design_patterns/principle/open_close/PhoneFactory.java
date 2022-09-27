package com.tw.design_patterns.principle.open_close;

import org.junit.jupiter.api.Test;

abstract class PhoneFactory {
    String phoneType;

    abstract void produce();
}

class XiaoMiFactory extends PhoneFactory {

    public XiaoMiFactory() {
        this.phoneType = "小米";
    }

    @Override
    void produce() {
        System.out.println(phoneType + "生产成功");
    }
}

class ApplePhoneFactory extends PhoneFactory {

    public ApplePhoneFactory() {
        this.phoneType = "苹果";
    }

    @Override
    void produce() {
        System.out.println(phoneType + "生产成功");
    }
}

class ProducerTest {
    @Test
    public void test() {
        PhoneFactory xm = new XiaoMiFactory();
        xm.produce();
        PhoneFactory apple = new ApplePhoneFactory();
        apple.produce();
    }
}
