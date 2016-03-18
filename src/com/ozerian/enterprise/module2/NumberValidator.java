package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Validator;

/**
 * Validator for Number type of data, implements Validator<T> interface.
 */
public class NumberValidator implements Validator<Number> {

    /**
     * This method checks if the result of task operation is more than 0.
     * @param value checking parameter with <T>-type.
     * @return boolean if result > 0 - true, if result <=0 - false.
     */
    @Override
    public boolean isValid(Number value) {

        if (value.intValue() <= 0) {
            return false;
        }
        return true;
    }
}
