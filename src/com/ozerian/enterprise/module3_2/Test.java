package com.ozerian.enterprise.module3_2;


public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int numbersOfThread = 3;
        ArrayUtils arrayUtil = new ArrayUtils(numbersOfThread);
        long result = arrayUtil.getSquareSum(array, numbersOfThread);
        System.out.println(result);
        }
    }
