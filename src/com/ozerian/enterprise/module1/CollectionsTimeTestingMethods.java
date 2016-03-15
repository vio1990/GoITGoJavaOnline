package com.ozerian.enterprise.module1;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * This class contains methods, which indicate average time for
 * processing different methods of ArrayList, LinkedList, HashSet,
 * TreeSet in order to compare this time's values.
 */

public class CollectionsTimeTestingMethods {

    private int elementsQuantity;
    private int testQuantity;
    private long totalTime;
    private long startTime;
    private long endTime;
    private long result;



    /**
     * Constructor creates an object fot testing collections' efficiency.
     * @param elementsQuantity an amount of elements quantity, which are being added in collection.
     * @param testQuantity an amount of tests' quantity (for more accurate time result).
     */
    public CollectionsTimeTestingMethods(int elementsQuantity, int testQuantity) {
        this.elementsQuantity = elementsQuantity;
        this.testQuantity = testQuantity;
    }

    /**
     * Testing of collections' populate. Used for Lists and Sets.
     * @param collection list or set which are being tested.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */

    public long populateTestForCollection(Collection<Integer> collection) {

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            collection.clear();
            startTime = System.nanoTime();

            for (int j = 0; j < elementsQuantity; j++) {
                collection.add(j);
            }

            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation add(index) method. Used only for Lists.
     * @param list list which are being tested.
     * @param valueAndPosition added value and its position in the collection.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */
    public long addIndexTestForList(List<Integer> list, int valueAndPosition) {

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            list.add(valueAndPosition, valueAndPosition);
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation add(value) method. Used only for Sets.
     * it used elementsQuantity++ as an added value after each loop's iteration.
     * This is done in order to prevent duplicate values in Set. Because
     * the Set would already have values from '0' to "elementsQuantity".
     * @param set set which are being tested.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */
    public long addTestForSet(Set<Integer> set) {

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            set.add(elementsQuantity++);
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation remove(value) method. Used for Sets and Lists.
     * @param collection list or set which are being tested.
     * @param value removed value from the collection.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */
    public long removeTestForList(Collection<Integer> collection, int value) {

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            collection.remove(value);
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation get(index) method. Used only for Lists.
     * @param list list which are being tested.
     * @param position value's position in the collection.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */

    public long getTestForList(List<Integer> list, int position) {

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            list.get(position);
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation remove(value) method. Used for Sets.
     * @param set set which are being tested.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */

    public long removeTestForSet(Set<Integer> set) {

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            set.remove(elementsQuantity++);
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation contains(value) method. Used for Lists and Sets.
     * Checking if collection has an input value.
     * @param collection list or set which are being tested.
     * @param value checking value.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */
    public long containsTestForCollection(Collection<Integer> collection, int value) {

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            collection.contains(value);
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation add(value) method by means of iterator. Used only for Lists.
     * It created a ListIterator with start position as a constructor's parameter.
     * @param list ist which are being tested.
     * @param value added value to the collection.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */
    public long iteratorAddTestForList(List<Integer> list, int value) {

        ListIterator<Integer> iterator = list.listIterator(value);

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            iterator.add(value);
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }

    /**
     * Testing of implementation remove(value) method by means of iterator. Used only for Lists.
     * It created a ListIterator with start position as a constructor's parameter.
     * @param list ist which are being tested.
     * @param value removed value from the collection.
     * @return the average time implemented operations for appropriate quantity of the tests.
     */
    public long iteratorRemoveTestForList(List<Integer> list, int value) {

        ListIterator<Integer> iterator = list.listIterator(value);

        totalTime = 0;

        for (int i = 0; i < testQuantity; i++) {
            startTime = System.nanoTime();
            iterator.next();
            iterator.remove();
            endTime = System.nanoTime();
            result = endTime - startTime;
            totalTime += result;
        }
        return totalTime / testQuantity;
    }
}
