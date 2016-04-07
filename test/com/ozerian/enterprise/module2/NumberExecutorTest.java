package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.interfaces.Task;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class NumberExecutorTest {
    @org.testng.annotations.Test
    public void ExecuteWithValidator() throws Exception {
        NumberExecutor executor = new NumberExecutor();
        NumberValidator validator = new NumberValidator();
        executor.addTask(new AddTask(1, 2), validator);
        executor.execute();
        Assert.assertEquals(executor.getValidResults().get(0), 3, "Wrong execution result!");
    }

    @org.testng.annotations.Test
    public void ExecuteWithValidatorInvalid() throws Exception {
        NumberExecutor executor = new NumberExecutor();
        NumberValidator validator = new NumberValidator();
        executor.addTask(new AddTask(1, -2), validator);
        executor.execute();
        Assert.assertEquals(executor.getInvalidResults().get(0), -1, "Wrong execution result!");
    }


    private static class AddTask implements Task<Integer> {

        private int summand1;
        private int summand2;
        private int result;

        public AddTask(int summand1, int summand2) {
            this.summand1 = summand1;
            this.summand2 = summand2;
        }

        @Override
        public void execute() {
            result = summand1 + summand2;
        }

        @Override
        public Integer getResult() {
            return result;
        }
    }

}