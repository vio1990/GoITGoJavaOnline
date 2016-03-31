package com.ozerian.enterprise.module1;

import java.io.IOException;
import java.util.*;


class TestImplementation {

    private int testQuantity;
    private int amountOfElements;
    private String writtenDataInFile;

    TestImplementation(int testQuantity, int amountOfElements) throws IOException {
        this.testQuantity = testQuantity;
        this.amountOfElements = amountOfElements;
    }

    // creating of the testing Collections' implementations.
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();
    private Set<Integer> hashSet = new HashSet<>();
    private Set<Integer> treeSet = new TreeSet<>();

    /* creating an object CollectionsTimeTestingMethods class with
     the amount of elements and amount of tests as constructor's parameters.
     */

    /**
     * Running all of the tests for each type of Collections.
     */
    void runTest() {
        CollectionsTimeTestingMethods test = new CollectionsTimeTestingMethods(amountOfElements, testQuantity);

        //ArrayList testing

        // populate testing.
        long avaragePopulateArrayList = test.populateTestForCollection(arrayList);

        // add() testing in at three positions (top, middle and end).
        long addToMiddleIndexArrayList = test.addIndexTestForList(arrayList, amountOfElements / 2);
        long addToTopIndexArrayList = test.addIndexTestForList(arrayList, 0);
        long addToEndIndexArrayList = test.addIndexTestForList(arrayList, amountOfElements);

        // remove() testing in at three positions (top, middle and end).
        long removeFromMiddleArrayList = test.removeTestForList(arrayList, amountOfElements / 2);
        long removeFromTopArrayList = test.removeTestForList(arrayList, 0);
        long removeFromEndArrayList = test.removeTestForList(arrayList, amountOfElements);

        // get() testing in at three positions (top, middle and end).
        long getFromMiddleArrayList = test.getTestForList(arrayList, amountOfElements / 2);
        long getFromTopArrayList = test.getTestForList(arrayList, 0);
        long getFromEndArrayList = test.getTestForList(arrayList, amountOfElements - 1);

        // contains() testing in at three positions (top, middle and end).
        long containsMiddleValueArrayList = test.containsTestForCollection(arrayList, amountOfElements / 2);
        long containsFirstValueArrayList = test.containsTestForCollection(arrayList, 0);
        long containsEndValueArrayList = test.getTestForList(arrayList, amountOfElements - 1);

        // iterator.add() testing in at three positions (top, middle and end).
        long iteratorAddToMiddleArrayList = test.iteratorAddTestForList(arrayList, amountOfElements / 2);
        long iteratorAddToTopArrayList = test.iteratorAddTestForList(arrayList, 0);
        long iteratorAddToEndArrayList = test.iteratorAddTestForList(arrayList, amountOfElements);

        // iterator.remove() testing in at three positions (top, middle and end).
        long iteratorRemoveFromMiddleArrayList = test.iteratorRemoveTestForList(arrayList, amountOfElements / 2);
        long iteratorRemoveFromTopArrayList = test.iteratorRemoveTestForList(arrayList, 0);
        long iteratorRemoveFromEndArrayList = test.iteratorRemoveTestForList(arrayList, amountOfElements);

        //LinkedList

        // populate testing.
        long avaragePopulateLinkedList = test.populateTestForCollection(linkedList);

        // add() testing in at three positions (top, middle and end).
        long addToMiddleIndexLinkedList = test.addIndexTestForList(linkedList, amountOfElements / 2);
        long addToTopIndexLinkedList = test.addIndexTestForList(linkedList, 0);
        long addToEndIndexLinkedList = test.addIndexTestForList(linkedList, amountOfElements);

        // remove() testing in at three positions (top, middle and end).
        long removeFromMiddleLinkedList = test.removeTestForList(linkedList, amountOfElements / 2);
        long removeFromTopLinkedList = test.removeTestForList(linkedList, 0);
        long removeFromEndLinkedList = test.removeTestForList(linkedList, amountOfElements);

        // get() testing in at three positions (top, middle and end).
        long getFromMiddleLinkedList = test.getTestForList(linkedList, amountOfElements / 2);
        long getFromTopLinkedList = test.getTestForList(linkedList, 0);
        long getFromEndLinkedList = test.getTestForList(linkedList, amountOfElements - 1);

        // contains() testing in at three positions (top, middle and end).
        long containsMiddleValueLinkedList = test.containsTestForCollection(linkedList, amountOfElements / 2);
        long containsFirstValueLinkedList = test.containsTestForCollection(linkedList, 0);
        long containsEndValueLinkedList = test.getTestForList(linkedList, amountOfElements - 1);

        // iterator.add() testing in at three positions (top, middle and end).
        long iteratorAddToMiddleLinkedList = test.iteratorAddTestForList(linkedList, amountOfElements / 2);
        long iteratorAddToTopLinkedList = test.iteratorAddTestForList(linkedList, 0);
        long iteratorAddToEndLinkedList = test.iteratorAddTestForList(linkedList, amountOfElements);

        // iterator.remove() testing in at three positions (top, middle and end).
        long iteratorRemoveFromMiddleLinkedList = test.iteratorRemoveTestForList(linkedList, amountOfElements / 2);
        long iteratorRemoveFromTopLinkedList = test.iteratorRemoveTestForList(linkedList, 0);
        long iteratorRemoveFromEndLinkedList = test.iteratorRemoveTestForList(linkedList, amountOfElements);

        //HashSet

        // populate testing.
        long avaragePopulateHashSet = test.populateTestForCollection(hashSet);

        // add() testing.
        long addValueHashSet = test.addTestForSet(hashSet);

        // remove() testing.
        long removeValueHashSet = test.removeTestForSet(hashSet);

        // contains() testing.
        long containsValueHashSet = test.containsTestForCollection(hashSet, amountOfElements);

        //TreeSet

        // populate testing.
        long avaragePopulateTreeSet = test.populateTestForCollection(treeSet);

        // add() testing.
        long addValueTreeSet = test.addTestForSet(treeSet);

        // remove() testing.
        long removeValueTreeSet = test.removeTestForSet(treeSet);

        // contains() testing.
        long containsValueTreeSet = test.containsTestForCollection(treeSet, amountOfElements);

        // creating table's columns and rows with methods' names and time implementation results.

        String leftAlignFormat = "| %-21s | %-9d | %-9d | %-9d | %-9d |%n";

        String tableOfContents = "RESULTS OF THE TEST FOR " + amountOfElements + " ELEMENTS.\n";
        String line1 = String.format("+-----------------------+-----------+-----------+-----------+-----------+%n");
        String line2 = String.format("|Method name/Coll. type | ArrayList | LinkedList|  HashSet  |  TreeSet  |%n");
        String line3 = String.format("+-----------------------+-----------+-----------+-----------+-----------+%n");
        String line4 = String.format(leftAlignFormat, "populate", avaragePopulateArrayList, avaragePopulateLinkedList, avaragePopulateHashSet, avaragePopulateTreeSet);
        String line5 = String.format(leftAlignFormat, "add(index) Top", addToTopIndexArrayList, addToTopIndexLinkedList, 0, 0);
        String line6 = String.format(leftAlignFormat, "add(index) Mid", addToMiddleIndexArrayList, addToMiddleIndexLinkedList, 0, 0);
        String line7 = String.format(leftAlignFormat, "add(index) End", addToEndIndexArrayList, addToEndIndexLinkedList, 0, 0);
        String line8 = String.format(leftAlignFormat, "get(index) Top", getFromTopArrayList, getFromTopLinkedList, 0, 0);
        String line9 = String.format(leftAlignFormat, "get(index) Mid", getFromMiddleArrayList, getFromMiddleLinkedList, 0, 0);
        String line10 = String.format(leftAlignFormat, "get(index) End", getFromEndArrayList, getFromEndLinkedList, 0, 0);
        String line11 = String.format(leftAlignFormat, "remove(index) Top", removeFromTopArrayList, removeFromTopLinkedList, 0, 0);
        String line12 = String.format(leftAlignFormat, "remove(index) Mid", removeFromMiddleArrayList, removeFromMiddleLinkedList, 0, 0);
        String line13 = String.format(leftAlignFormat, "remove(index) End", removeFromEndArrayList, removeFromEndLinkedList, 0, 0);
        String line14 = String.format(leftAlignFormat, "contains (value) Top", containsFirstValueArrayList, containsFirstValueLinkedList, 0, 0);
        String line15 = String.format(leftAlignFormat, "contains (value) Mid", containsMiddleValueArrayList, containsMiddleValueLinkedList, 0, 0);
        String line16 = String.format(leftAlignFormat, "contains (value) End", containsEndValueArrayList, containsEndValueLinkedList, 0, 0);
        String line17 = String.format(leftAlignFormat, "iterator.add() Top", iteratorAddToTopArrayList, iteratorAddToTopLinkedList, 0, 0);
        String line18 = String.format(leftAlignFormat, "iterator.add() Mid", iteratorAddToMiddleArrayList, iteratorAddToMiddleLinkedList, 0, 0);
        String line19 = String.format(leftAlignFormat, "iterator.add() End", iteratorAddToEndArrayList, iteratorAddToEndLinkedList, 0, 0);
        String line20 = String.format(leftAlignFormat, "iterator.remove() Top", iteratorRemoveFromTopArrayList, iteratorRemoveFromTopLinkedList, 0, 0);
        String line21 = String.format(leftAlignFormat, "iterator.remove() Mid", iteratorRemoveFromMiddleArrayList, iteratorRemoveFromMiddleLinkedList, 0, 0);
        String line22 = String.format(leftAlignFormat, "iterator.remove() End", iteratorRemoveFromEndArrayList, iteratorRemoveFromEndLinkedList, 0, 0);
        String line23 = String.format(leftAlignFormat, "add(value)", 0, 0, addValueHashSet, addValueTreeSet);
        String line24 = String.format(leftAlignFormat, "remove(value)", 0, 0, removeValueHashSet, removeValueTreeSet);
        String line25 = String.format(leftAlignFormat, "contains (value)", 0, 0, containsValueHashSet, containsValueTreeSet);
        String line26 = String.format("+-----------------------+-----------+-----------+-----------+-----------+%n");


        StringBuilder totalDataForTable = new StringBuilder();

        // building the table withe lines and columns;
        writtenDataInFile = totalDataForTable.append(tableOfContents).append(line1).append(line2).append(line3).append(line4).append(line5).append(line6).
                append(line7).append(line8).append(line9).append(line10).append(line11).append(line12).append(line13).
                append(line14).append(line15).append(line16).append(line17).append(line18).append(line19).append(line20).
                append(line21).append(line22).append(line23).append(line24).append(line25).append(line26).toString();

    }

    /**
     * Printing the table with results of the test.
     */
    void printResults() {
        System.out.println(writtenDataInFile);
    }

    /**
     * Writing results into new created file.
     *
     * @throws IOException
     */
    void writeResultsToFile() throws IOException {
        FileWriterForTable.fileWriter(amountOfElements, writtenDataInFile);
    }
}

