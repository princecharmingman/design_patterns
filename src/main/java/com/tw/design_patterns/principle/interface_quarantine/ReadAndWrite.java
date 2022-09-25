package com.tw.design_patterns.principle.interface_quarantine;

public interface ReadAndWrite {
    void read();

    void write();
}

class readA implements ReadAndWrite {

    @Override
    public void read() {
        System.out.println("读取！");
    }

    @Override
    public void write() {
    }
}

class writeA implements ReadAndWrite {

    @Override
    public void read() {
        System.out.println("读取");
    }

    @Override
    public void write() {
        System.out.println("写入");
    }
}
