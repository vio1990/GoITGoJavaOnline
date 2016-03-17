package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Executor;
import com.ozerian.enterprise.module2.Interfaces.Task;
import com.ozerian.enterprise.module2.Interfaces.Validator;

import java.util.ArrayList;
import java.util.List;

public class NumberExecutor implements Executor<Number> {

    private List<Number> validResults = new ArrayList<>();
    private List<Number> invalidResults = new ArrayList<>();
    private List<Task<? extends Number>> taskList = new ArrayList<>();

    @Override
    public void addTask(Task<? extends Number> task) {
        taskList.add(task);
        validResults.add(task.getResult());
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
    public List<Number> getValidResults() {
        return validResults;
    }

    @Override
    public List<Number> getInvalidResults() {
        return invalidResults;
    }
}
