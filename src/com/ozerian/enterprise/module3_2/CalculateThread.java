package com.ozerian.enterprise.module3_2;

public class CalculateThread implements Runnable {

    private int[] numbersArray;

    private long partResult;

    public CalculateThread(int[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbersArray.length; i++) {
            int elementSquare = numbersArray[i] * numbersArray[i];
            partResult += elementSquare;
        }
    }

    public long getPartResult() {
        return partResult;
    }

    public int[] getNumbersArray() {
        return numbersArray;
    }
}
