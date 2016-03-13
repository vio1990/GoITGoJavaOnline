package com.ozerian.enterprise.module1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int testQuantity = 100;
        long result = 0;
        for (int i = 0; i < testQuantity; i++) {
            arrayList.clear();
            long startTime = System.nanoTime();
            for (int j = 0; j < 10000; j++) {
                arrayList.add(j);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            result += duration;
        }
        result = result / testQuantity;
        System.out.println(result);
    }
}
