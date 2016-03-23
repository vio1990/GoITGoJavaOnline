package com.ozerian.enterprise.module3.semaphore_permit_test;

import com.ozerian.enterprise.module3.SimpleSemaphore;

public class ThreadRegulatorPermit implements Runnable {

    private SimpleSemaphore simpleSemaphore;
    private int permit;

    public ThreadRegulatorPermit(SimpleSemaphore simpleSemaphore, int permit) {
        this.permit = permit;
        this.simpleSemaphore = simpleSemaphore;
    }

    @Override
    public void run() {
        try {
            simpleSemaphore.acquire(permit);
            System.out.println(Thread.currentThread().getName() + " start working!");
            System.out.println(Thread.currentThread().getName() + " do some work!");
            Thread.currentThread().sleep(1000);
            System.out.println(Thread.currentThread().getName() + " stop working!");
            simpleSemaphore.release(permit);
            System.out.println(simpleSemaphore.getAvailablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
