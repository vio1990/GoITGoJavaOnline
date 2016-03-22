package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.interfaces.Task;

/**
 * This class implements Task interface and typified by Integer.
 */
public class AddInteger implements Task<Integer> {

    private int firstSummand;
    private int secondSummand;
    private int result;

    /**
     * The constructor for the class' object.
     * @param firstSummand int First summand what will be used in task operation.
     * @param secondSummand int Second summand what will be used in task operation.
     */
    public AddInteger(int firstSummand, int secondSummand) {
        this.firstSummand = firstSummand;
        this.secondSummand = secondSummand;
    }

    /**
     * This method add two summands, which are determined in constructor.
     */
    @Override
    public void execute() {
        result = firstSummand + secondSummand;
    }

    /**
     * The method returns of the adding two numbers.
     * @return int result of the adding.
     */
    @Override
    public Integer getResult() {
        return result;
    }
}