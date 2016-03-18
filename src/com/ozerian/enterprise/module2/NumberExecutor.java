package com.ozerian.enterprise.module2;

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

    /**
     * Add a task to perform. It means that the task is being added to the taskList.
     * @param task task, which adding for implementation.
     */
    @Override
    public void addTask(Task<? extends Number> task) {
        taskList.add(task);
    }

    /**
     * Add a task to perform with result validation. It means that the task is being added to the taskList.
     * @param task task, which adding for implementation.
     * @param numberValidator checking if result is valid.
     */
    @Override
    public void addTask(Task<? extends Number> task, Validator<Number> numberValidator) {
        taskList.add(task);
        if (!numberValidator.isValid(task.getResult())) {
            validResults.add(task.getResult());
        } else {
            invalidResults.add(task.getResult());
        }
    }

    /**
     * Implementation of all added tasks.
     */
    @Override
    public void execute() {
        for (Task<? extends Number> tasks : taskList) {
            tasks.execute();
        }
    }

    /**
     * This method add to validResults list correct results or
     * add non-corerect results to invalidResults' list and return it.
     * @return List of valid results.
     */
    @Override
    public List<Number> getValidResults() {
        for (Task<? extends Number> tasks : taskList) {
            if (resultValidator.isValid(tasks.getResult())) {
                validResults.add(tasks.getResult());
            } else {
                invalidResults.add(tasks.getResult());
            }
        }
        return validResults;
    }

    /**
     * This method return the list with invalidResults.
     * @return List of invalid results.
     */
    @Override
    public List<Number> getInvalidResults() {
        return invalidResults;
    }
}
