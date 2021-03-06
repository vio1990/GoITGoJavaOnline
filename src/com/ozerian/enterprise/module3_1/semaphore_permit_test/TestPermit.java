package com.ozerian.enterprise.module3_1.semaphore_permit_test;

import com.ozerian.enterprise.module3_1.SimpleSemaphore;
import com.ozerian.enterprise.module3_1.ThreadRegulator;

public class TestPermit {
    public static void main(String[] args) throws InterruptedException {
        SimpleSemaphore simpleSemaphore = new SimpleSemaphore(3);
        for (int i = 0; i < 5; i++) {
            new Thread(new ThreadRegulator(simpleSemaphore)).start();
            Thread.currentThread().sleep(400);
        }

        new Thread(() -> {
            try {
                System.out.println(simpleSemaphore.getAvailablePermits());
                simpleSemaphore.acquire(3);
                System.out.println(simpleSemaphore.getAvailablePermits());
                System.out.println("Permit " + Thread.currentThread().getName() + " start working!");
                System.out.println("Permit " + Thread.currentThread().getName() + " do some work!");
                Thread.currentThread().sleep(1000);
                System.out.println(simpleSemaphore.getAvailablePermits());
                System.out.println("Permit " + Thread.currentThread().getName() + " stop working!");
                simpleSemaphore.release(3);
                System.out.println(simpleSemaphore.getAvailablePermits());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(400);


        for (int i = 0; i < 3; i++) {
            new Thread(new ThreadRegulator(simpleSemaphore)).start();
            Thread.currentThread().sleep(400);
        }
    }
}
