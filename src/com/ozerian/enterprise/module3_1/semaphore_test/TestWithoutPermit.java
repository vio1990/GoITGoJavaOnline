package com.ozerian.enterprise.module3_1.semaphore_test;

import com.ozerian.enterprise.module3_1.SimpleSemaphore;
import com.ozerian.enterprise.module3_1.ThreadRegulator;

public class TestWithoutPermit {
    public static void main(String[] args) throws InterruptedException {
        SimpleSemaphore simpleSemaphore = new SimpleSemaphore(3);

        for (int i = 0; i < 10; i++) {
            new Thread(new ThreadRegulator(simpleSemaphore)).start();
            Thread.currentThread().sleep(400);
        }
    }
}
