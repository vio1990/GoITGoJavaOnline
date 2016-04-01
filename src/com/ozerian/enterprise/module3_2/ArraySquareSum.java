package com.ozerian.enterprise.module3_2;

import com.ozerian.enterprise.module3_2.interfaces.SquareSum;

public class ArraySquareSum implements SquareSum{

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        long result = 0;
        for (int i = 0; i < values.length; i++) {
            int number = (int) Math.pow(values[i], 2);
            result += number;
        }
        return result;
    }
}
