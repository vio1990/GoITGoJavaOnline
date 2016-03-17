package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Validator;

public class NumberValidator implements Validator<Number> {

    @Override
    public boolean isValid(Number value) {

        if (value.intValue() <= 0) {
            return false;
        }
        return true;
    }
}
