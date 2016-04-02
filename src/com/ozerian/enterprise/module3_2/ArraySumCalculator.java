package com.ozerian.enterprise.module3_2;

public class ArraySumCalculator implements Runnable {

    private int numberOfThreads;
    private int arraySize;
    private ArrayUtils squareSum = new ArrayUtils();
    private int[] numberArray = ArrayUtils.getArray(arraySize);

    public ArraySumCalculator(int numberOfThreads, int arraySize) {
        this.numberOfThreads = numberOfThreads;
        this.arraySize = arraySize;
    }

    @Override
    public void run() {
        squareSum.getSquareSum(numberArray, numberOfThreads);
    }

}

