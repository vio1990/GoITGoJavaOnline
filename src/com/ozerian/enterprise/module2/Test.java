package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Executor;
import com.ozerian.enterprise.module2.Interfaces.Task;
import com.ozerian.enterprise.module2.Interfaces.Validator;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Task<Integer>> taskIntList = Arrays.asList(new AddInteger(5, 12), new AddInteger(11, 11), new AddInteger(5, 3));

        Executor<Number> numberExecutor = new NumberExecutor();

        for (Task<Integer> intTask : taskIntList) {
            numberExecutor.addTask(intTask);
        }

        numberExecutor.addTask(new AddDouble(11.1, 12.3), new NumberValidator());

        numberExecutor.execute();

        System.out.println("Valid results: ");
        for (Number number : numberExecutor.getValidResults()) {
            System.out.println(number);
        }

        System.out.println("Invalid results: ");
        for (Number number : numberExecutor.getInvalidResults()) {
            System.out.println(number);
        }
    }
}
