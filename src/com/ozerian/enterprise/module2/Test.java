package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Interfaces.Executor;
import com.ozerian.enterprise.module2.Interfaces.Task;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Task<Integer>> taskIntList = Arrays.asList(new AddInteger(5, 12), new AddInteger(11, 11), new AddInteger(5, 3));
        List<Task<Double>> taskDoubleList = Arrays.asList(new AddDouble(3.1, 1.2), new AddDouble(11.2, 1.1));

        Executor<? extends Number> numberExecutor = new NumberExecutor<>();

        for (Task<Integer> intTask : taskIntList) {
            numberExecutor.addTask(intTask);

        }

    }
}
