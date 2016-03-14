package com.ozerian.enterprise.module1;

import java.util.ArrayList;
import java.util.List;

public class ListTimeTesting {

    public static long addTest(List<Integer> list, int testsQuantity, int elementsQuantity) {

        long result = 0;
        for (int i = 0; i < testsQuantity; i++) {
            list.clear();
            long startTime = System.nanoTime();
            for (int j = 0; j < elementsQuantity; j++) {
                list.add(j,j);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            result += duration;
        }
        return result / testsQuantity;
    }

    public static long getTest(List<Integer> list, int testsQuantity, int elementsQuantity) {

        long result = 0;
        for (int i = 0; i < testsQuantity; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < elementsQuantity; j++) {
                list.get(j);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            result += duration;
        }
        return result / testsQuantity;
    }

    public static long removeTest(List<Integer> list, int testsQuantity, int elementsQuantity) {

        long result = 0;
        for (int i = 0; i < testsQuantity; i++) {
            long startTime = System.nanoTime();
            for (int j = 0; j < elementsQuantity; j++) {
                list.remove(j);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            result += duration;
        }
        return result / testsQuantity;
    }
}

