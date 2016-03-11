package com.ozerian.core.module5.array_sorter_finder;

public class Main {
    public static void main(String[] args) {

        int[] numbers = Array.arrayInit(10);
        Array.arrayPrint(numbers);

        int minValue = Finder.minArrayValue(numbers);
        System.out.println(minValue + " is minimum array's number");

        int maxValue = Finder.maxArrayValue(numbers);
        System.out.println(maxValue + " is maximum array's number");

        Sorter.bubbleSort(numbers);
        System.out.println("SorterArray: ");
        Array.arrayPrint(numbers);

        Sorter.gnomeSort(numbers);
        System.out.println("SorterArray: ");
        Array.arrayPrint(numbers);
    }
}
