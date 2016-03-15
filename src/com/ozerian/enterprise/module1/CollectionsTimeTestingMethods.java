package com.ozerian.enterprise.module1;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CollectionsTimeTestingMethods {

    private int elementsQuantity;
    private int testQuantity;

    public CollectionsTimeTestingMethods(int elementsQuantity, int testQuantity) {
        this.elementsQuantity = elementsQuantity;
        this.testQuantity = testQuantity;
    }

    public long populateTestForCollection(Collection<Integer> collection) {

        long totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            collection.clear();
            long startTime = System.nanoTime();

            for (int j = 0; j < elementsQuantity; j++) {
                collection.add(j);
            }

            long endTime = System.nanoTime();
            long result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    public long addIndexTestForList(List<Integer> list, int position) {

        long totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            long startTime = System.nanoTime();
            list.add(position, position);
            long endTime = System.nanoTime();
            long result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    public long addTestForSet(Set<Integer> set) {

        long totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            long startTime = System.nanoTime();
            set.add(elementsQuantity++);
            long endTime = System.nanoTime();
            long result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    public long removeTestForList(Collection<Integer> collection, int position) {

        long totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            long startTime = System.nanoTime();
            collection.remove(position);
            long endTime = System.nanoTime();
            long result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    public long getTestForList(List<Integer> list, int position) {

        long totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            long startTime = System.nanoTime();
            list.get(position);
            long endTime = System.nanoTime();
            long result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    public long removeTestForSet(Set<Integer> set) {

        long totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            long startTime = System.nanoTime();
            set.remove(elementsQuantity++);
            long endTime = System.nanoTime();
            long result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    public long containsTestForCollection(Collection<Integer> collection, int value) {

        long totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            long startTime = System.nanoTime();
            collection.contains(value);
            long endTime = System.nanoTime();
            long result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    public long iteratorAddTestForList(List<Integer> list, int value) {

        ListIterator<Integer> iterator = list.listIterator(value);
        long startTime = System.nanoTime();
        iterator.add(value);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long iteratorRemoveTestForList(List<Integer> list, int value) {

        ListIterator<Integer> iterator = list.listIterator(value);
        long startTime = System.nanoTime();
        iterator.next();
        iterator.remove();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
