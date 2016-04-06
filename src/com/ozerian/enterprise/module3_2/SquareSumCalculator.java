package com.ozerian.enterprise.module3_2;

import com.ozerian.enterprise.module3_2.interfaces.SquareSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Class with methods for common calculation of the input array.
 */
public class SquareSumCalculator implements SquareSum {

    private int numbersOfThread;
    private List<CalculateThread> taskList = new ArrayList<>();
    private final Phaser phaser;
    private AtomicLong result = new AtomicLong(0);
    private final ExecutorService executor;

    /**
     * Constructor of the class object.
     * @param numbersOfThread Set number of threads.
     * @param phaser Phaser object for regulation threads running.
     * @param executor ExecutorService object for executing of tasks.
     */
    public SquareSumCalculator(int numbersOfThread, Phaser phaser, ExecutorService executor) {
        this.numbersOfThread = numbersOfThread;
        this.phaser = phaser;
        this.executor = executor;
    }

    /**
     *
     * @param values input array for the calculation.
     * @param numberOfThreads set numbers of the participating threads.
     * @return long final result of calculation.
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Override
    public long getSquareSum(int[] values, int numberOfThreads) throws ExecutionException, InterruptedException {
        fillTasksList(values, numberOfThreads);

        List<Future<Long>> results = executor.invokeAll(taskList);
        for (Future<Long> longFuture : results) {
            result.addAndGet(longFuture.get());
        }
        phaser.arriveAndDeregister();
        return result.longValue();
    }

    /**
     * Divide an input array into parts between participating threads.
     * @param values Input array to divide.
     * @param startIndex int start index of the array's range.
     * @param endIndex int end index of the array range.
     * @return divided array.
     */
    public int[] arrayPartDivider(int[] values, int startIndex, int endIndex) {
        int[] partOfArray = Arrays.copyOfRange(values, startIndex, endIndex);
        return partOfArray;
    }

    /**
     * Fill the list of the tasks with divided arrays.
     * @param values an input primordial whole array.
     * @param numberOfThread Set number of threads.
     */
    public void fillTasksList(int[] values, int numberOfThread) {

        int partLength = values.length / numberOfThread;
        int startIndex;
        int endIndex;

        for (int i = 0; i < numberOfThread; i++) {
            startIndex = i * partLength;
            if (i == numberOfThread - 1) {
                endIndex = values.length;
            } else {
                endIndex = (i + 1) * partLength;
            }
            int[] arrayPart = arrayPartDivider(values, startIndex, endIndex);
            taskList.add(new CalculateThread(arrayPart, phaser));
        }
    }

    /**
     * Method for the access to the result.
     * @return long teh final result.
     */
    public synchronized Long getResult() {
        return result.longValue();
    }
}
