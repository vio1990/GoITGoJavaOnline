package com.ozerian.enterprise.module1;

import java.util.*;

public class TestForSmallAmountOfElements {
    public static void main(String[] args) {

        final int testQuantity = 100;
        final int smallAmountOfElements = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        // test for 10000 elements
        CollectionsTimeTestingMethods firstTest = new CollectionsTimeTestingMethods(smallAmountOfElements, testQuantity);

        //ArrayList

        long avaragePopulateArrayList = firstTest.populateTestForCollection(arrayList);

        long addToMiddleIndexArrayList = firstTest.addIndexTestForList(arrayList, smallAmountOfElements / 2);
        long addToTopIndexArrayList = firstTest.addIndexTestForList(arrayList, 0);
        long addToEndIndexArrayList = firstTest.addIndexTestForList(arrayList, smallAmountOfElements);

        long removeFromMiddleArrayList = firstTest.removeTestForList(arrayList, smallAmountOfElements / 2);
        long removeFromTopArrayList = firstTest.removeTestForList(arrayList, 0);
        long removeFromEndArrayList = firstTest.removeTestForList(arrayList, smallAmountOfElements);

        long getFromMiddleArrayList = firstTest.getTestForList(arrayList, smallAmountOfElements / 2);
        long getFromTopArrayList = firstTest.getTestForList(arrayList, 0);
        long getFromEndArrayList = firstTest.getTestForList(arrayList, smallAmountOfElements - 1);

        long containsMiddleValueArrayList = firstTest.containsTestForCollection(arrayList, smallAmountOfElements / 2);
        long containsFirstValueArrayList = firstTest.containsTestForCollection(arrayList, 0);
        long containsEndValueArrayList = firstTest.getTestForList(arrayList, smallAmountOfElements - 1);

        long iteratorAddToMiddleArrayList = firstTest.iteratorAddTestForList(arrayList, smallAmountOfElements / 2);
        long iteratorAddToTopArrayList = firstTest.iteratorAddTestForList(arrayList, 0);
        long iteratorAddToEndArrayList = firstTest.iteratorAddTestForList(arrayList, smallAmountOfElements);

        long iteratorRemoveFromMiddleArrayList = firstTest.iteratorRemoveTestForList(arrayList, smallAmountOfElements / 2);
        long iteratorRemoveFromTopArrayList = firstTest.iteratorRemoveTestForList(arrayList, 0);
        long iteratorRemoveFromEndArrayList = firstTest.iteratorRemoveTestForList(arrayList, smallAmountOfElements);

        // print results of the testing
        System.out.println("ArrayList methods efficiency for " + smallAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateArrayList + " nanoseconds");
        System.out.println("add(): top:" + addToTopIndexArrayList + " middle: " + addToMiddleIndexArrayList + " end: " + addToEndIndexArrayList);
        System.out.println("remove(): top: " + removeFromTopArrayList + " middle: " + removeFromMiddleArrayList + " end: " + removeFromEndArrayList);
        System.out.println("get(): top: " + getFromTopArrayList + " middle: " + getFromMiddleArrayList + " end: " + getFromEndArrayList);
        System.out.println("contains(): top: " + containsFirstValueArrayList + " middle: " + containsMiddleValueArrayList + " end: " + containsEndValueArrayList);
        System.out.println("iterator.add(): top: " + iteratorAddToTopArrayList + " middle: " + iteratorAddToMiddleArrayList + " end: " + iteratorAddToEndArrayList);
        System.out.println("iterator.remove(): top: " + iteratorRemoveFromTopArrayList + " middle: " + iteratorRemoveFromMiddleArrayList + " end: " + iteratorRemoveFromEndArrayList);
        System.out.println();

        //LinkedList

        long avaragePopulateLinkedList = firstTest.populateTestForCollection(linkedList);

        long addToMiddleIndexLinkedList = firstTest.addIndexTestForList(linkedList, smallAmountOfElements / 2);
        long addToTopIndexLinkedList = firstTest.addIndexTestForList(linkedList, 0);
        long addToEndIndexLinkedList = firstTest.addIndexTestForList(linkedList, smallAmountOfElements);

        long removeFromMiddleLinkedList = firstTest.removeTestForList(linkedList, smallAmountOfElements / 2);
        long removeFromTopLinkedList = firstTest.removeTestForList(linkedList, 0);
        long removeFromEndLinkedList = firstTest.removeTestForList(linkedList, smallAmountOfElements);

        long getFromMiddleLinkedList = firstTest.getTestForList(linkedList, smallAmountOfElements / 2);
        long getFromTopLinkedList = firstTest.getTestForList(linkedList, 0);
        long getFromEndLinkedList = firstTest.getTestForList(linkedList, smallAmountOfElements - 1);

        long containsMiddleValueLinkedList = firstTest.containsTestForCollection(linkedList, smallAmountOfElements / 2);
        long containsFirstValueLinkedList = firstTest.containsTestForCollection(linkedList, 0);
        long containsEndValueLinkedList = firstTest.getTestForList(linkedList, smallAmountOfElements - 1);

        long iteratorAddToMiddleLinkedList = firstTest.iteratorAddTestForList(linkedList, smallAmountOfElements / 2);
        long iteratorAddToTopLinkedList = firstTest.iteratorAddTestForList(linkedList, 0);
        long iteratorAddToEndLinkedList = firstTest.iteratorAddTestForList(linkedList, smallAmountOfElements);

        long iteratorRemoveFromMiddleLinkedList = firstTest.iteratorRemoveTestForList(linkedList, smallAmountOfElements / 2);
        long iteratorRemoveFromTopLinkedList = firstTest.iteratorRemoveTestForList(linkedList, 0);
        long iteratorRemoveFromEndLinkedList = firstTest.iteratorRemoveTestForList(linkedList, smallAmountOfElements);

        // print results of the testing
        System.out.println("LinkedList methods efficiency for " + smallAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateLinkedList + " nanoseconds");
        System.out.println("add(): top:" + addToTopIndexLinkedList + " middle: " + addToMiddleIndexLinkedList + " end: " + addToEndIndexLinkedList);
        System.out.println("remove(): top: " + removeFromTopLinkedList + " middle: " + removeFromMiddleLinkedList + " end: " + removeFromEndLinkedList);
        System.out.println("get(): top: " + getFromTopLinkedList + " middle: " + getFromMiddleLinkedList + " end: " + getFromEndLinkedList);
        System.out.println("contains(): top: " + containsFirstValueLinkedList + " middle: " + containsMiddleValueLinkedList + " end: " + containsEndValueLinkedList);
        System.out.println("iterator.add(): top: " + iteratorAddToTopLinkedList + " middle: " + iteratorAddToMiddleLinkedList + " end: " + iteratorAddToEndLinkedList);
        System.out.println("iterator.remove(): top: " + iteratorRemoveFromTopLinkedList + " middle: " + iteratorRemoveFromMiddleLinkedList + " end: " + iteratorRemoveFromEndLinkedList);
        System.out.println();

        //HashSet

        long avaragePopulateHashSet = firstTest.populateTestForCollection(hashSet);

        long addValueHashSet = firstTest.addTestForSet(hashSet);

        long removeValueHashSet = firstTest.removeTestForSet(hashSet);

        long containsValueHashSet = firstTest.containsTestForCollection(hashSet, smallAmountOfElements);

        // print results of the testing
        System.out.println("HashSet methods efficiency for " + smallAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateHashSet + " nanoseconds");
        System.out.println("add(): " + addValueHashSet);
        System.out.println("remove(): " + removeValueHashSet);
        System.out.println("contains(): " + containsValueHashSet);
        System.out.println();

        //TreeSet

        long avaragePopulateTreeSet = firstTest.populateTestForCollection(treeSet);

        long addValueTreeSet = firstTest.addTestForSet(treeSet);

        long removeValueTreeSet = firstTest.removeTestForSet(treeSet);

        long containsValueTreeSet = firstTest.containsTestForCollection(treeSet, smallAmountOfElements);

        // print results of the testing
        System.out.println("TreeSet methods efficiency for " + smallAmountOfElements + " elements (in nanoseconds):");
        System.out.println("populate: " + avaragePopulateTreeSet + " nanoseconds");
        System.out.println("add(): " + addValueTreeSet);
        System.out.println("remove(): " + removeValueTreeSet);
        System.out.println("contains(): " + containsValueTreeSet);
        System.out.println();

    }
}