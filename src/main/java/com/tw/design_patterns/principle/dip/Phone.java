package com.tw.design_patterns.principle.dip;

import org.junit.jupiter.api.Test;

public class Phone {
    public void play(PhoneMusic music) {
        System.out.println("播放" + music.getMusic() + "!");
    }
}

class PhoneMusic {
    public String getMusic() {
        return "成都";
    }
}


class MainTest {
    @Test
    public void test() {
        new Phone().play(new PhoneMusic());
    }
}