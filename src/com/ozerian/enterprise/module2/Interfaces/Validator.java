package com.ozerian.enterprise.module2.Interfaces;

public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T value);

}
