package com.ozerian.module6.bouquet;

public class ZeroQuantityFlowersException extends Exception {
    private int flowersQuantity;

    public ZeroQuantityFlowersException(int flowersQuantity) {
        this.flowersQuantity = flowersQuantity;
    }

    public int getFlowersQuantity() {
        return flowersQuantity;
    }
}
