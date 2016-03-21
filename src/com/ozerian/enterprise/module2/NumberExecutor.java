package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Exceptions.ExecuteWasLaunchedException;
import com.ozerian.enterprise.module2.Exceptions.ExecuteWasNotLaunchException;
import com.ozerian.enterprise.module2.Interfaces.Executor;
import com.ozerian.enterprise.module2.Interfaces.Task;
import com.ozerian.enterprise.module2.Interfaces.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * This class executes Tasks operations and typified by Number.
 */
public class NumberExecutor implements Executor<Number> {

    private List<Number> validResults = new ArrayList<>();
    private List<Number> invalidResults = new ArrayList<>();
    private List<Task<? extends Number>> taskList = new ArrayList<>();
    private Validator<Number> resultValidator = new NumberValidator();
    private Task<? extends Number> task;
    private Validator<Number> validator;
    private static boolean isExecuteLaunch = false;

    /**
     * Add a task to perform. It means that the task is being added to the taskList.
     *
     * @param task task, which adding for implementation.
     */
    @Override
    public void addTask(Task<? extends Number> task) throws ExecuteWasLaunchedException {
        if (isExecuteLaunch) {
            throw new ExecuteWasLaunchedException();
        }
        taskList.add(task);
    }

    /**
     * Add a task to perform with result validation. It means that the task is being added to the taskList.
     *
     * @param currentTask            task, which adding for implementation.
     * @param numberValidator checking if result is valid.
     */
    @Override
    public void addTask(Task<? extends Number> currentTask, Validator<Number> numberValidator) throws ExecuteWasLaunchedException {
        this.task = currentTask;
        this.validator = numberValidator;
        if (isExecuteLaunch) {
            throw new ExecuteWasLaunchedException();
        }
        taskList.add(currentTask);
    }

    /**
     * Implementation of all added tasks.
     */
    @Override
    public void execute() {
        isExecuteLaunch = true;
        for (Task<? extends Number> tasks : taskList) {
            tasks.execute();
            if (validator.isValid(tasks.getResult())) {
                validResults.add(tasks.getResult());
            } else {
                invalidResults.add(tasks.getResult());
            }
        }
    }

    /**
     * This method add to validResults list correct results or
     * add non-correct results to invalidResults' list and return it.
     *
     * @return List of valid results.
     */
    @Override
    public List<Number> getValidResults() throws ExecuteWasNotLaunchException {
        if (!isExecuteLaunch) {
            throw new ExecuteWasNotLaunchException();
        }
        return validResults;
    }

    /**
     * This method return the list with invalidResults.
     *
     * @return List of invalid results.
     */
    @Override
    public List<Number> getInvalidResults() throws ExecuteWasNotLaunchException {
        if (!isExecuteLaunch) {
            throw new ExecuteWasNotLaunchException();
        }
        return invalidResults;
    }
}
