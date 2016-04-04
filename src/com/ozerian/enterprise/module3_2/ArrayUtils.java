package com.ozerian.enterprise.module3_2;

import com.ozerian.enterprise.module3_2.interfaces.SquareSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayUtils implements SquareSum {
    private int begin = 0;
    private int partLength = 0;
    private AtomicInteger result = new AtomicInteger(0);
    Phaser phaser = new Phaser();
    List<Integer[]> array = new ArrayList<>();

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        partLength = values.length / numberOfThreads;
        partLength = (values.length % numberOfThreads > 0) ? partLength + 1 : partLength;

        for (int i = begin; i < partLength; i++) {
            int number = values[i] * values[i];
             result.addAndGet(number);
        }
        phaser.arriveAndAwaitAdvance();
        return result.longValue();
    }

    public static int[] getArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
