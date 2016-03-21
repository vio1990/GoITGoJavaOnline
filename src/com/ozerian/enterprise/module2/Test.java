package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.Exceptions.ExecuteWasLaunchedException;
import com.ozerian.enterprise.module2.Exceptions.ExecuteWasNotLaunchException;
import com.ozerian.enterprise.module2.Interfaces.Executor;
import com.ozerian.enterprise.module2.Interfaces.Task;

import java.util.Arrays;
import java.util.List;

/**
 * This is the test class, which demonstrates framework implementation.
 */
public class Test {
    public static void main(String[] args) {

        try {
            List<Task<Integer>> taskIntList = Arrays.asList(new AddInteger(5, 12), new AddInteger(-11, -11), new AddInteger(5, 3));

            Executor<Number> numberExecutor = new NumberExecutor();

            for (Task<Integer> intTask : taskIntList) {
                numberExecutor.addTask(intTask);
            }

            numberExecutor.addTask(new AddDouble(11.1, 12.3), new NumberValidator());

            numberExecutor.execute();

            System.out.println("Valid results: ");
            numberExecutor.getValidResults().forEach(System.out::println);

            System.out.println("Invalid results: ");
            numberExecutor.getInvalidResults().forEach(System.out::println);
        } catch (ExecuteWasLaunchedException e) {
            System.out.println("Execute method launch detected!");
            e.printStackTrace();
        } catch (ExecuteWasNotLaunchException e) {
            System.out.println("Execute method hasn't been launched!");
            e.printStackTrace();
        }
    }


}
