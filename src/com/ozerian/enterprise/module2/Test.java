package com.ozerian.enterprise.module2;

import com.ozerian.enterprise.module2.exceptions.WrongExecuteLaunchException;
import com.ozerian.enterprise.module2.interfaces.Executor;
import com.ozerian.enterprise.module2.interfaces.Task;

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

            numberExecutor.addTask(new AddDouble(11.2, 12.3), new NumberValidator());

            numberExecutor.execute();

            System.out.println("Valid results: ");
            numberExecutor.getValidResults().forEach(System.out::println);

            System.out.println("Invalid results: ");
            numberExecutor.getInvalidResults().forEach(System.out::println);

        } catch (WrongExecuteLaunchException e) {
            System.out.println("Premature launch or no launch execute's method detected!");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Error! Wrong command sequence!");
            e.printStackTrace();
        }
    }
}
