package com.tw.design_patterns.principle.dip;

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


class PlayTest {
    public static void main(String[] args) {
        new PhoneDip().play(new ChengDu());
    }
}