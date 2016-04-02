package com.ozerian.enterprise.module3_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public void runTask(Runnable task, int threadQuantity) {
        ExecutorService executor = Executors.newFixedThreadPool(threadQuantity);
        executor.execute(task);
        executor.shutdown();
        System.out.println("Task is complete!");
    }
}
