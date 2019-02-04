package com.yogurts.thread;

public class YGBlockThread {

    public static void main(String[] args) {
        // 礼让
        Thread.yield();
        // 睡眠
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
