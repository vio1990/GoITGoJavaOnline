package com.ozerian.enterprise.module2.interfaces;

import com.ozerian.enterprise.module2.exceptions.ExecuteWasLaunchedException;
import com.ozerian.enterprise.module2.exceptions.ExecuteWasNotLaunchException;

import java.util.List;

/**
 * Interface for execution some tasks.
 *
 * @param <T> This describe type parameter.
 */
public interface Executor<T> {

    /**
     * Add a task to perform.
     *
     * @param task task, which adding for implementation.
     */
    void addTask(Task<? extends T> task) throws ExecuteWasLaunchedException;

    /**
     * Add task to perform with result's validation.
     *
     * @param task      task, which adding for implementation.
     * @param validator validator for checking the correctness of task's result.
     */
    void addTask(Task<? extends T> task, Validator<T> validator) throws ExecuteWasLaunchedException;

    /**
     * Implementation of all added tasks.
     */
    void execute();

    /**
     * The method returns the list with positive results, which will be handled by validator.
     *
     * @return the list with correct tasks' results.
     */
    List<? extends T> getValidResults() throws ExecuteWasNotLaunchException;

    /**
     * The method returns the list with invalid results, which will be handled by validator.
     *
     * @return the list with non-correct tasks' results.
     */
    List<? extends T> getInvalidResults() throws ExecuteWasNotLaunchException;

}
