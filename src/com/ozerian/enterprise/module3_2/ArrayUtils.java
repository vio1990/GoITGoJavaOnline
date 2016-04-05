package com.ozerian.enterprise.module3_2;

import com.ozerian.enterprise.module3_2.interfaces.SquareSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicLong;

public class ArrayUtils implements SquareSum {

    private int numbersOfThread;

    public ArrayUtils(int numbersOfThread) {
        this.numbersOfThread = numbersOfThread;
    }

    private List<CalculateThread> taskList = new ArrayList<>();
    private ExecutorService executor = Executors.newFixedThreadPool(numbersOfThread);
    private final Phaser phaser = new Phaser();
    private AtomicLong result = new AtomicLong(0);

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        fillTasksList(values, numberOfThreads);
        phaser.register();
        for (CalculateThread task : taskList) {
            phaser.register();
            executor.execute(task);
            phaser.arriveAndAwaitAdvance();
            result.addAndGet(task.getPartResult());
            executor.shutdown();
        }
        phaser.arriveAndDeregister();
        return result.longValue();
    }

    public int[] arrayPartDivider(int[] values, int startIndex, int endIndex) {
        int[] partOfArray = Arrays.copyOfRange(values, startIndex, endIndex);
        return partOfArray;
    }

    public void fillTasksList(int[] values, int numberOfThread) {

        int partLength = values.length / numberOfThread;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < numberOfThread; i++) {
            startIndex = i * partLength;
            if (i == numberOfThread - 1) {
                endIndex = values.length;
            } else {
                endIndex = (i + 1) * partLength;
            }
            int[] arrayPart = arrayPartDivider(values, startIndex, endIndex);
            taskList.add(new CalculateThread(arrayPart));
        }
    }
}
