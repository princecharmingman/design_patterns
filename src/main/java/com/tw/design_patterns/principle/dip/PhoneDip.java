package com.tw.design_patterns.principle.dip;

import org.junit.jupiter.api.Test;

public class PhoneDip {
    public void play(Music music) {
        System.out.println("播放:" + music.getMusic() + "!");
    }
}

abstract class Music {
    public abstract String getMusic();
}

class ChengDu extends Music {
    public String getMusic() {
        return "成都";
    }
}
class DaHai extends Music {
    public String getMusic() {
        return "大海";
    }
}


class PlayTest {
    @Test
    public void test() {
        new PhoneDip().play(new DaHai());
    }
}
