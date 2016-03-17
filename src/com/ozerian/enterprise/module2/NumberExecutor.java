package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Executor;
import com.ozerian.enterprise.module2.Interfaces.Task;
import com.ozerian.enterprise.module2.Interfaces.Validator;

import java.util.List;

public class NumberExecutor implements Executor<Number> {

    private List<? extends Number> validResults;
    private List<? extends Number> invalidResults;
    private List<Task<? extends Number>> taskList;

    @Override
    public void addTask(Task<? extends Number> task) {
        taskList.add(task);
    }

    @Override
    public void addTask(Task<? extends Number> task, Validator<Number> numberValidator) {
        taskList.add(task);
        if (!numberValidator.isValid(task.getResult())) {
            validResults.add(task.getResult());
        } else {
            invalidResults.add(task.getResult());
        }
    }

    @Override
    public void execute() {
        for (Task<? extends Number> tasks : taskList) {
            tasks.execute();
        }
    }

    @Override
    public List<? extends Number> getValidResults() {
        return validResults;
    }

    @Override
    public List<? extends Number> getInvalidResults() {
        return invalidResults;
    }
}
