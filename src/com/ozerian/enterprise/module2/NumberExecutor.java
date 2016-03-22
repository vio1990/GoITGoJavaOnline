package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.exceptions.ExecuteWasLaunchedException;
import com.ozerian.enterprise.module2.exceptions.ExecuteWasNotLaunchException;
import com.ozerian.enterprise.module2.interfaces.Executor;
import com.ozerian.enterprise.module2.interfaces.Task;
import com.ozerian.enterprise.module2.interfaces.Validator;

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
    private Validator<? super Number> validator;
    private static boolean isExecuteLaunched = false;

    /**
     * Add a task to perform. It means that the task is being added to the taskList.
     *
     * @param currentTask task, which adding for implementation.
     */
    @Override
    public void addTask(Task<? extends Number> currentTask) throws ExecuteWasLaunchedException {
        this.task = currentTask;
        if (isExecuteLaunched) {
            throw new ExecuteWasLaunchedException("Premature execute method launch detected!");
        }
        taskList.add(currentTask);
    }

    /**
     * Add a task to perform with result validation. It means that the task is being added to the taskList.
     *
     * @param currentTask     task, which adding for implementation.
     * @param numberValidator checking if result is valid.
     */
    @Override
    public void addTask(Task<? extends Number> currentTask, Validator<? super Number> numberValidator) throws ExecuteWasLaunchedException {
        this.task = currentTask;
        this.validator = numberValidator;
        if (isExecuteLaunched) {
            throw new ExecuteWasLaunchedException("Premature execute method launch detected!");
        }
        taskList.add(currentTask);
    }

    /**
     * Implementation of all added tasks.
     */
    @Override
    public void execute() {
        isExecuteLaunched = true;
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
        if (!isExecuteLaunched) {
            throw new ExecuteWasNotLaunchException("Execute method hasn't been launched!");
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
        if (!isExecuteLaunched) {
            throw new ExecuteWasNotLaunchException("Execute method hasn't been launched!");
        }
        return invalidResults;
    }
}
