package com.ozerian.module5.array_sorter_finder;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        Finder finder = new Finder();
        Sorter sorter = new Sorter();

        int[] numbers = array.arrayInit(10);

        finder.minArrayValue(numbers);
        finder.maxArrayValue(numbers);
        sorter.bubbleSort(numbers);
        sorter.gnomeSort(numbers);
    }
}
