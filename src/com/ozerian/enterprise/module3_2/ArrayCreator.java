package com.ozerian.enterprise.module3_2;

import java.util.Random;

public class ArrayCreator {

    public static int[] getArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }
}
