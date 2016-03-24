package com.ozerian.enterprise.module2.interfaces;

/**
 * The interface with methods for some Task, which wil be
 * described and implemented.
 * @param <T> This describe type parameter of the Task.
 */
public interface Task<T> {

    /**
     * Implementation of the task.
     */
    void execute();


    /**
     * This method returns the result of executed task.
     * @return <T> result some <T>-type.
     */
    T getResult();

}

