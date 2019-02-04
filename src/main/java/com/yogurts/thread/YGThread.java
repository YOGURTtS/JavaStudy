package com.yogurts.thread;

public class YGThread {

    public static void main(String[] args) {
        // 用户线程 守护线程
        new Thread(new YGPrimeThread()).start();
    }
}

class YGPrimeThread implements Runnable {
    public void run() {
        System.out.println("哈哈");
    }
}


