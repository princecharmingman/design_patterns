package com.tw.design_patterns.principle.single_resp;

import org.junit.jupiter.api.Test;

public class Transport {
    public void toFillUp(String transport, double volume) {
        System.out.println(transport + "加油" + volume + "L");
    }
}

class MainTest {
    @Test
    public void test() {
        Transport transport = new Transport();
        transport.toFillUp("宝马", 1);
        transport.toFillUp("新日电动车", 2);
    }
}


