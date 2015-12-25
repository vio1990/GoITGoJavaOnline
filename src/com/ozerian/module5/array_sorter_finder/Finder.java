package com.ozerian.module5.array_sorter_finder;

public class Finder {
    public void minArrayValue(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (min > numbers[i + 1]) {
                min = numbers[i + 1];
            }
        }
        System.out.println(min + " is minimum array's number");
    }

    public void maxArrayValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (max < numbers[i + 1]) {
                max = numbers[i + 1];
            }
        }
        System.out.println(max + " is minimum array's number");
    }
}
