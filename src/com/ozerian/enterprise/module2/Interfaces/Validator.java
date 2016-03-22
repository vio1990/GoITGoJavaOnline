package com.ozerian.enterprise.module2.interfaces;

/**
 * Interface for checking the correctness some value.
 * @param <T> It describes the type of parameter.
 */
public interface Validator<T> {

    /**
     * This method checks if the parameter meets the some criteria.
     * @param value checking parametr with <T>-type.
     * @return boolean true if the parameter is correct, and false- conversely.
     */
    boolean isValid(T value);

}
