package com.ozerian.core.module5.array_sorter_finder;

public class Sorter {
    public static int[] bubbleSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int place = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = place;
                }
            }
        }
        return numbers;
    }

    public static int[] gnomeSort(int[] numbers) {
        int i = 1;
        while (i < numbers.length) {
            if (i == 0 || numbers[i - 1] <= numbers[i]) {
                i++;
            } else {
                int place = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = place;
                i--;
            }
        }
        return numbers;
    }
}
