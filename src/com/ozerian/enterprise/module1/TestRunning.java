package com.ozerian.enterprise.module1;

import java.io.IOException;

public class TestRunning {
    public static void main(String[] args) throws IOException {
        try {

            // Test for small amount of elements.
            TestImplementation smallAmount = new TestImplementation(100, 10000);
            smallAmount.runTest();
            smallAmount.printResults();
            smallAmount.writeResultsToFile();

            // Test for middle amount of elements.
            TestImplementation middleAmount = new TestImplementation(100, 100000);
            middleAmount.runTest();
            middleAmount.printResults();
            middleAmount.writeResultsToFile();

            // Test for big amount of elements.
            TestImplementation bigAmount = new TestImplementation(100, 1000000);
            bigAmount.runTest();
            bigAmount.printResults();
            bigAmount.writeResultsToFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
