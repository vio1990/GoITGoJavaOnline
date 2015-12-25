package com.ozerian.module5.array_sorter_finder;

public class Sorter {
    public void bubbleSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int place = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = place;
                }
            }
        }
        System.out.print("SorterArray: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void gnomeSort(int[] numbers) {
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
        System.out.print("SorterArray: ");

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }
}
