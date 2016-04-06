package com.ozerian.enterprise.module3_2;

import java.util.concurrent.Callable;
import java.util.concurrent.Phaser;

/**
 * Class is intended for calculating an array's part.
 * Implements Callable interface.
 */
public class CalculateThread implements Callable<Long> {

    private int[] numbersArray;
    private long partResult;
    private final Phaser phaser;

    /**
     * Constructor for class' object.
     * @param numbersArray Array with corresponding range.
     * @param phaser Phaser for regulation parallel threads running.
     */
    public CalculateThread(int[] numbersArray, Phaser phaser) {
        this.numbersArray = numbersArray;
        this.phaser = phaser;
        phaser.register();
    }

    /**
     * Overriding method of Callable interface.
     * Calculation array's element squared.
     * @return long result of the calculation
     */
    @Override
    public Long call() {
        System.out.println(Thread.currentThread().getName() + " start working");

        for (int i = 0; i < numbersArray.length; i++) {
            int elementSquare = numbersArray[i] * numbersArray[i];
            partResult += elementSquare;
        }

        System.out.println(Thread.currentThread().getName() + " arrive and await. Part of array result " + partResult);
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " stop working!");
        return partResult;
    }
}
