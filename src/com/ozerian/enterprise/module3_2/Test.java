package com.ozerian.enterprise.module3_2;


import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class Test {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(100);
        }

        int numbersOfThread = 4;

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
