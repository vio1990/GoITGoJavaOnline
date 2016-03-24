package com.ozerian.enterprise.module3;

import com.ozerian.enterprise.module3.SimpleSemaphore;

public class ThreadRegulator implements Runnable {

    private SimpleSemaphore simpleSemaphore;

    public ThreadRegulator(SimpleSemaphore simpleSemaphore) {
        this.simpleSemaphore = simpleSemaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println(simpleSemaphore.getAvailablePermits());
            simpleSemaphore.acquire();
            System.out.println(simpleSemaphore.getAvailablePermits());
            System.out.println(Thread.currentThread().getName() + " start working!");
            System.out.println(Thread.currentThread().getName() + " do some work!");
            Thread.currentThread().sleep(1000);
            System.out.println(simpleSemaphore.getAvailablePermits());
            simpleSemaphore.release();
            System.out.println(simpleSemaphore.getAvailablePermits());
            System.out.println(Thread.currentThread().getName() + " stop working!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
