package com.ozerian.enterprise.module3.semaphore_permit_test;

import com.ozerian.enterprise.module3.SimpleSemaphore;
import com.ozerian.enterprise.module3.ThreadRegulator;

public class TestPermit {
    public static void main(String[] args) throws InterruptedException {
        SimpleSemaphore simpleSemaphore = new SimpleSemaphore(5);

        for (int i = 0; i < 3; i++) {
            new Thread(new ThreadRegulator(simpleSemaphore)).start();
            Thread.currentThread().sleep(400);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(simpleSemaphore.getAvailablePermits());
                    simpleSemaphore.acquire(3);
                    System.out.println(simpleSemaphore.getAvailablePermits());
                    System.out.println("Permit " + Thread.currentThread().getName() + " start working!");
                    System.out.println("Permit " + Thread.currentThread().getName() + " do some work!");
                    Thread.currentThread().sleep(1000);
                    System.out.println(simpleSemaphore.getAvailablePermits());
                    simpleSemaphore.release(3);
                    System.out.println(simpleSemaphore.getAvailablePermits());
                    System.out.println("Permit " + Thread.currentThread().getName() + " stop working!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.currentThread().sleep(400);


        for (int i = 0; i < 3; i++) {
            new Thread(new ThreadRegulator(simpleSemaphore)).start();
            Thread.currentThread().sleep(400);
        }
    }
}
