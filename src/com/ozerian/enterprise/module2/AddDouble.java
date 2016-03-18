package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Task;

/**
 * This class implements Task interface and typified by Double.
 */
public class AddDouble implements Task<Double> {

    private double firstSummand;
    private double secondSummand;
    private double result;

    /**
     * The constructor for the class' object.
     * @param firstSummand double  First summand what will be used in task operation.
     * @param secondSummand dounle Second summand what will be used in task operation.
     */
    public AddDouble(double firstSummand, double secondSummand) {
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
     * @return double result of the adding.
     */
    @Override
    public Double getResult() {
        return result;
    }
}
