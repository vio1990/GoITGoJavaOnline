package com.ozerian.enterprise.module1;

import java.util.*;

public class TestForBigAmountOfElements {
    public static void main(String[] args) {
        final int testQuantity = 100;
        final int bigAmountOfElements = 1000000;

        // creating of the testing Collections' implementations.
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        /* creating an object CollectionsTimeTestingMethods class with
         the amount of elements and amount of tests as constructor's parameters.
         */
        CollectionsTimeTestingMethods test = new CollectionsTimeTestingMethods(bigAmountOfElements, testQuantity);

        //ArrayList testing

        // populate testing.
        long avaragePopulateArrayList = test.populateTestForCollection(arrayList);

        // add() testing in at three positions (top, middle and end).
        long addToMiddleIndexArrayList = test.addIndexTestForList(arrayList, bigAmountOfElements / 2);
        long addToTopIndexArrayList = test.addIndexTestForList(arrayList, 0);
        long addToEndIndexArrayList = test.addIndexTestForList(arrayList, bigAmountOfElements);

        // remove() testing in at three positions (top, middle and end).
        long removeFromMiddleArrayList = test.removeTestForList(arrayList, bigAmountOfElements / 2);
        long removeFromTopArrayList = test.removeTestForList(arrayList, 0);
        long removeFromEndArrayList = test.removeTestForList(arrayList, bigAmountOfElements);

        // get() testing in at three positions (top, middle and end).
        long getFromMiddleArrayList = test.getTestForList(arrayList, bigAmountOfElements / 2);
        long getFromTopArrayList = test.getTestForList(arrayList, 0);
        long getFromEndArrayList = test.getTestForList(arrayList, bigAmountOfElements - 1);

        // contains() testing in at three positions (top, middle and end).
        long containsMiddleValueArrayList = test.containsTestForCollection(arrayList, bigAmountOfElements / 2);
        long containsFirstValueArrayList = test.containsTestForCollection(arrayList, 0);
        long containsEndValueArrayList = test.getTestForList(arrayList, bigAmountOfElements - 1);

        // iterator.add() testing in at three positions (top, middle and end).
        long iteratorAddToMiddleArrayList = test.iteratorAddTestForList(arrayList, bigAmountOfElements / 2);
        long iteratorAddToTopArrayList = test.iteratorAddTestForList(arrayList, 0);
        long iteratorAddToEndArrayList = test.iteratorAddTestForList(arrayList, bigAmountOfElements);

        // iterator.remove() testing in at three positions (top, middle and end).
        long iteratorRemoveFromMiddleArrayList = test.iteratorRemoveTestForList(arrayList, bigAmountOfElements / 2);
        long iteratorRemoveFromTopArrayList = test.iteratorRemoveTestForList(arrayList, 0);
        long iteratorRemoveFromEndArrayList = test.iteratorRemoveTestForList(arrayList, bigAmountOfElements);

        // print results of the testing
        System.out.println("ArrayList methods efficiency for " + bigAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateArrayList + " nanoseconds");
        System.out.println("add(): top:" + addToTopIndexArrayList + " middle: " + addToMiddleIndexArrayList + " end: " + addToEndIndexArrayList);
        System.out.println("remove(): top: " + removeFromTopArrayList + " middle: " + removeFromMiddleArrayList + " end: " + removeFromEndArrayList);
        System.out.println("get(): top: " + getFromTopArrayList + " middle: " + getFromMiddleArrayList + " end: " + getFromEndArrayList);
        System.out.println("contains(): top: " + containsFirstValueArrayList + " middle: " + containsMiddleValueArrayList + " end: " + containsEndValueArrayList);
        System.out.println("iterator.add(): top: " + iteratorAddToTopArrayList + " middle: " + iteratorAddToMiddleArrayList + " end: " + iteratorAddToEndArrayList);
        System.out.println("iterator.remove(): top: " + iteratorRemoveFromTopArrayList + " middle: " + iteratorRemoveFromMiddleArrayList + " end: " + iteratorRemoveFromEndArrayList);
        System.out.println();

        //LinkedList

        // populate testing.
        long avaragePopulateLinkedList = test.populateTestForCollection(linkedList);

        // add() testing in at three positions (top, middle and end).
        long addToMiddleIndexLinkedList = test.addIndexTestForList(linkedList, bigAmountOfElements / 2);
        long addToTopIndexLinkedList = test.addIndexTestForList(linkedList, 0);
        long addToEndIndexLinkedList = test.addIndexTestForList(linkedList, bigAmountOfElements);

        // remove() testing in at three positions (top, middle and end).
        long removeFromMiddleLinkedList = test.removeTestForList(linkedList, bigAmountOfElements / 2);
        long removeFromTopLinkedList = test.removeTestForList(linkedList, 0);
        long removeFromEndLinkedList = test.removeTestForList(linkedList, bigAmountOfElements);

        // get() testing in at three positions (top, middle and end).
        long getFromMiddleLinkedList = test.getTestForList(linkedList, bigAmountOfElements / 2);
        long getFromTopLinkedList = test.getTestForList(linkedList, 0);
        long getFromEndLinkedList = test.getTestForList(linkedList, bigAmountOfElements - 1);

        // contains() testing in at three positions (top, middle and end).
        long containsMiddleValueLinkedList = test.containsTestForCollection(linkedList, bigAmountOfElements / 2);
        long containsFirstValueLinkedList = test.containsTestForCollection(linkedList, 0);
        long containsEndValueLinkedList = test.getTestForList(linkedList, bigAmountOfElements - 1);

        // iterator.add() testing in at three positions (top, middle and end).
        long iteratorAddToMiddleLinkedList = test.iteratorAddTestForList(linkedList, bigAmountOfElements / 2);
        long iteratorAddToTopLinkedList = test.iteratorAddTestForList(linkedList, 0);
        long iteratorAddToEndLinkedList = test.iteratorAddTestForList(linkedList, bigAmountOfElements);

        // iterator.remove() testing in at three positions (top, middle and end).
        long iteratorRemoveFromMiddleLinkedList = test.iteratorRemoveTestForList(linkedList, bigAmountOfElements / 2);
        long iteratorRemoveFromTopLinkedList = test.iteratorRemoveTestForList(linkedList, 0);
        long iteratorRemoveFromEndLinkedList = test.iteratorRemoveTestForList(linkedList, bigAmountOfElements);

        // print results of the testing
        System.out.println("LinkedList methods efficiency for " + bigAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateLinkedList + " nanoseconds");
        System.out.println("add(): top:" + addToTopIndexLinkedList + " middle: " + addToMiddleIndexLinkedList + " end: " + addToEndIndexLinkedList);
        System.out.println("remove(): top: " + removeFromTopLinkedList + " middle: " + removeFromMiddleLinkedList + " end: " + removeFromEndLinkedList);
        System.out.println("get(): top: " + getFromTopLinkedList + " middle: " + getFromMiddleLinkedList + " end: " + getFromEndLinkedList);
        System.out.println("contains(): top: " + containsFirstValueLinkedList + " middle: " + containsMiddleValueLinkedList + " end: " + containsEndValueLinkedList);
        System.out.println("iterator.add(): top: " + iteratorAddToTopLinkedList + " middle: " + iteratorAddToMiddleLinkedList + " end: " + iteratorAddToEndLinkedList);
        System.out.println("iterator.remove(): top: " + iteratorRemoveFromTopLinkedList + " middle: " + iteratorRemoveFromMiddleLinkedList + " end: " + iteratorRemoveFromEndLinkedList);
        System.out.println();

        //HashSet

        // populate testing.
        long avaragePopulateHashSet = test.populateTestForCollection(hashSet);

        // add() testing.
        long addValueHashSet = test.addTestForSet(hashSet);

        // remove() testing.
        long removeValueHashSet = test.removeTestForSet(hashSet);

        // contains() testing.
        long containsValueHashSet = test.containsTestForCollection(hashSet, bigAmountOfElements);

        // print results of the testing
        System.out.println("HashSet methods efficiency for " + bigAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateHashSet + " nanoseconds");
        System.out.println("add(): " + addValueHashSet);
        System.out.println("remove(): " + removeValueHashSet);
        System.out.println("contains(): " + containsValueHashSet);
        System.out.println();

        //TreeSet

        // populate testing.
        long avaragePopulateTreeSet = test.populateTestForCollection(treeSet);

        // add() testing.
        long addValueTreeSet = test.addTestForSet(treeSet);

        // remove() testing.
        long removeValueTreeSet = test.removeTestForSet(treeSet);

        // contains() testing.
        long containsValueTreeSet = test.containsTestForCollection(treeSet, bigAmountOfElements);

        // print results of the testing
        System.out.println("TreeSet methods efficiency for " + bigAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateTreeSet + " nanoseconds");
        System.out.println("add(): " + addValueTreeSet);
        System.out.println("remove(): " + removeValueTreeSet);
        System.out.println("contains(): " + containsValueTreeSet);
        System.out.println();

    }
}

