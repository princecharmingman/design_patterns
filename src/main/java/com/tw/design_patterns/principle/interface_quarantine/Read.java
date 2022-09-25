package com.tw.design_patterns.principle.interface_quarantine;

import org.junit.jupiter.api.Test;

public interface Read {
    void read();
}

interface Write {
    void write();
}

class ReadB implements Read {

    @Override
    public void read() {
        System.out.println("正在读取！");
    }
}

class WriteB implements Write {
    @Override
    public void write() {
        System.out.println("正在写入！");
    }
}

class ReadBndWriteData implements Write, Read {
    @Override
    public void write() {
        System.out.println("正在写入！");
    }

    @Override
    public void read() {
        System.out.println("正在读取！");
    }
}

class MainTest {
    @Test
    public void test() {
        ReadB readB = new ReadB();
        readB.read();
        WriteB writeB = new WriteB();
        writeB.write();
        ReadBndWriteData readBndWriteData = new ReadBndWriteData();
        readBndWriteData.read();
        readBndWriteData.write();
    }
}