package com.ozerian.enterprise.module1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int testQuantity = 10;
        int elementsQuantity = 100000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long arrayListAddTime = ListTimeTesting.addTest(arrayList, testQuantity, elementsQuantity);
        System.out.println("ArrayList add() time for " + elementsQuantity + " elements is - " + arrayListAddTime + " nanoseconds");

        long arrayListGetTime = ListTimeTesting.getTest(arrayList, testQuantity, elementsQuantity);
        System.out.println("ArrayList get() time for " + elementsQuantity + " elements is - " + arrayListGetTime + " nanoseconds");

        long linkedListAddTime = ListTimeTesting.addTest(linkedList, testQuantity, elementsQuantity);
        System.out.println("LinkedList add() time for " + elementsQuantity + " elements is - " + linkedListAddTime + " nanoseconds");

        long linkedListGetTime = ListTimeTesting.getTest(linkedList, testQuantity, elementsQuantity);
        System.out.println("LinkedList get() time for " + elementsQuantity + " elements is - " + linkedListGetTime + " nanoseconds");

    }
}
