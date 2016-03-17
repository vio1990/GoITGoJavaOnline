package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Task;

public class AddDouble implements Task<Double> {

    private double firstSummand;
    private double secondSummand;
    private double result;

    public AddDouble(double firstSummand, double secondSummand) {
        this.firstSummand = firstSummand;
        this.secondSummand = secondSummand;
    }

    @Override

    public void execute() {
        result = firstSummand + secondSummand;
    }

    @Override
    public Double getResult() {
        return result;
    }
}
