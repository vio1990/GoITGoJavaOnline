package com.ozerian.enterprise.module3_2;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class Test {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int numbersOfThread = 5;

        Phaser phaser = new Phaser();
        ExecutorService executor = Executors.newCachedThreadPool();

        SquareSumCalculator calculator = new SquareSumCalculator(numbersOfThread, phaser, executor);

        try {
            calculator.getSquareSum(array, numbersOfThread);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        phaser.awaitAdvance(0);
        executor.shutdown();

        System.out.println("The final result is " + calculator.getResult());
    }
}
