package com.tw.design_patterns.principle.lod;

public class B {
    private StrangerB stranger;

    public void talk(FriendOfA friend) {
        stranger.talk();
    }
}

class StrangerB {
    public void talk() {
        System.out.println("陌生人");
    }
}