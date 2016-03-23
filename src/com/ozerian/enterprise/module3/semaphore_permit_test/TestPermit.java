package com.ozerian.enterprise.module3.semaphore_permit_test;

import com.ozerian.enterprise.module3.SimpleSemaphore;

public class TestPermit {
    public static void main(String[] args) throws InterruptedException {
        SimpleSemaphore simpleSemaphore = new SimpleSemaphore(3);

        for (int i = 0; i < 10; i++) {
            new Thread(new ThreadRegulatorPermit(simpleSemaphore, 3)).start();
            Thread.currentThread().sleep(400);
        }
    }
}
