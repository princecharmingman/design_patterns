package com.tw.design_patterns.builder.build;


public class HuaWeiPhoneBuilder extends PhoneBuilder {
    public void buildCpu() {
        phone.setCpu("麒麟9000");
    }

    public void buildScreen() {
        phone.setScreen("京东方屏幕");
    }

    public Phone producePhone() {
        return phone;
    }
}
