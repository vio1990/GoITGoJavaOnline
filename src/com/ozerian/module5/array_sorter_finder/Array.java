package com.ozerian.module5.array_sorter_finder;

import java.util.Random;

public class Array {
    Random random = new Random();

    public int[] arrayInit(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return numbers;
    }
}
