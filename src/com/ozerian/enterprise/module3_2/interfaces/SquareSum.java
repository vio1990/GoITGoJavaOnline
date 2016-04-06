package com.ozerian.enterprise.module3_2.interfaces;

import java.util.concurrent.ExecutionException;

public interface SquareSum {

    long getSquareSum(int[] values, int numberOfThreads) throws InterruptedException, ExecutionException;

}
