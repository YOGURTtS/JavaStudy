package com.yogurts.thread;

public class YGMock12306 implements Runnable {

    int restTickets;
    public YGMock12306() {
        restTickets = 99;
    }

    public void run() {
        while (true) {
            if (restTickets <= 0) {
                System.out.println(Thread.currentThread().getName() + "票卖光了");
                return;
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "抢到票了，" + "剩余票数" + --restTickets);
            }
        }
    }

    public static void main(String[] args) {
        YGMock12306 mock12306 = new YGMock12306();
        new Thread(mock12306, "1号客户").start();
        new Thread(mock12306, "2号客户").start();
        new Thread(mock12306, "3号客户").start();
        new Thread(mock12306, "4号客户").start();
        new Thread(mock12306, "5号客户").start();
    }
}
