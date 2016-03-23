package com.ozerian.enterprise.module3.semaphore_test;

import com.ozerian.enterprise.module3.SimpleSemaphore;

public class ThreadRegulator implements Runnable {

    private SimpleSemaphore simpleSemaphore;

    public ThreadRegulator(SimpleSemaphore simpleSemaphore) {
        this.simpleSemaphore = simpleSemaphore;
    }

    @Override
    public void run() {
        try {
            simpleSemaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " start working!");
            System.out.println(Thread.currentThread().getName() + " do some work!");
            Thread.currentThread().sleep(1000);
            simpleSemaphore.release();
            System.out.println(Thread.currentThread().getName() + " stop working!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
