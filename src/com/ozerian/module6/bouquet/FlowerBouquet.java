package com.ozerian.module6.bouquet;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
В данном классе помимо существующих классов исключительных ситуаций обрабатывается
созданная мною исключительная ситуация ZeroQuantityException, срабатывающая, если пользователь введет
 "0" при созддании букета и указании количества цветов
 */

public class FlowerBouquet {
    Scanner scanner = new Scanner(System.in);
    private String[] bouquet;

    public FlowerBouquet() {
        try {
            int size = scanner.nextInt();
            if (size == 0) {
                throw new ZeroQuantityFlowersException(size);
            }
            this.bouquet = new String[size];
            System.out.println("The quantity of flowers is: " + size);
        } catch (InputMismatchException e) {
            System.out.println("[Error]: Please, enter integer numbers");
        } catch (NegativeArraySizeException en) {
            System.out.println("[Error] The bouquet cannot include negative quantity");
        } catch (ZeroQuantityFlowersException e) {
            System.out.println("[Error] The flowers quantity should be more than 0");
        }
    }

    public String[] getBouquet() {
        return bouquet;
    }

    public void bouquetContain() {
        System.out.print("Our bouquet include: ");
        for (int i = 0; i < getBouquet().length; i++) {
            System.out.print(getBouquet()[i] + " ");
        }
        System.out.println();
    }

}

