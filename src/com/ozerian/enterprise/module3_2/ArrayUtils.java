package com.ozerian.enterprise.module3_2;

import com.ozerian.enterprise.module3_2.interfaces.SquareSum;

import java.util.Random;
import java.util.concurrent.Phaser;

public class ArrayUtils implements SquareSum {
    private int begin = 0;
    Phaser phaser = new Phaser();

    public static int[] getArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        phaser.arrive();
        long result = 0;
        for (int i = begin  ; i < values.length; i++) {
            int number = (int) Math.pow(values[i], 2);
            result += number;
        }
        return result;
    }
}
