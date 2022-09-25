package com.tw.design_patterns.principle.lod;

public class A {
    private FriendOfA friend;

    public FriendOfA getFriend() {
        return friend;
    }

    public void setFriend(FriendOfA friend) {
        this.friend = friend;
    }

    public void talk(FriendOfA friend) {
        friend.talkWithStranger();
    }
}


class FriendOfA {

    public void talkWithStranger() {
        Stranger stranger = new Stranger();
        stranger.talk();
    }
}

class Stranger {
    public void talk() {
        System.out.println("陌生人");
    }
}