package com.ozerian.enterprise.module3_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArraySumCalculator implements Runnable {

    private int numberOfThreads;
    private int arraySize;
    private ArraySquareSum squareSum = new ArraySquareSum();
    private int[] numberArray = ArrayCreator.getArray(arraySize);

    public ArraySumCalculator(int numberOfThreads, int arraySize) {
        this.numberOfThreads = numberOfThreads;
        this.arraySize = arraySize;
    }

    @Override
    public void run() {
        squareSum.getSquareSum(numberArray, numberOfThreads);
    }

}

