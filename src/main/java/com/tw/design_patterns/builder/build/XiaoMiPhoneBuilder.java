package com.tw.design_patterns.builder.build;


public class XiaoMiPhoneBuilder extends PhoneBuilder {

    public void buildCpu() {
        phone.setCpu("高通骁龙888");
    }

    public void buildScreen() {
        phone.setScreen("三星屏幕");
    }

    public Phone producePhone() {
        return phone;
    }
}
