package com.yogurts.thread;

public class YGStopThread {

    public static void main(String[] args) {

        DemoThread demoThread = new DemoThread();
        Thread thread = new Thread(demoThread);
        thread.start();

        for (int i = 0; i < 99; ++i) {
            if (i == 90) {
                demoThread.stopThread();
            } else {
                System.out.println("哈哈");
            }
        }

    }
}

class DemoThread implements Runnable {

    public void stopThread() {
        flag = false;
    }

    public boolean flag = true;
    public void run() {
        while (flag) {
            System.out.println("运行中");
        }
    }
}
