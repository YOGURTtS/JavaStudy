package com.yogurts.thread;

public class YGLock {
    boolean isLocked = false;
    public synchronized void lock() throws InterruptedException {
        if (isLocked) {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}
