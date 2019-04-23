package com.yogurts.thread;

public class YGReLock {
    private boolean isLocked = false;
    private Thread lockedBy = null;
    private Integer holdCount = 0;

    public synchronized void lock() throws InterruptedException {
        Thread t = Thread.currentThread();

        while (isLocked && t != lockedBy) {
            wait();
        }

        isLocked = true;
        lockedBy = t;
        holdCount++;

    }

    public synchronized void unlock() {

        if (Thread.currentThread() == lockedBy) {
            holdCount--;
        }

        if (holdCount == 0) {
            isLocked = false;
            notify();
            lockedBy = null;
        }
    }
}
