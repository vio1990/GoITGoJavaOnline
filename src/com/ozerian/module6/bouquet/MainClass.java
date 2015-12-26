package com.ozerian.module6.bouquet;

import java.util.Scanner;
/*
Обработка исключительных ситуаций предусмотерна в классе "MainClass" и в классе "FlowerBouquet"
в конструкторе класса, при создании экземпляра, при помощи ввода данных от пользователя.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rose rose = new Rose();
        Aster aster = new Aster();
        Tulip tulip = new Tulip();
        Daisy daisy = new Daisy();

        System.out.println("Please, enter the quantity of flowers:");
        FlowerBouquet fb = new FlowerBouquet();

        try {
            for (int i = 0; i < fb.getBouquet().length; i++) {
                System.out.println("Enter the name of flower");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("rose") || name.equalsIgnoreCase("Rose")) {
                    name = rose.getName();
                    fb.getBouquet()[i] = name;
                } else if (name.equalsIgnoreCase("aster") || name.equalsIgnoreCase("Aster")) {
                    name = aster.getName();
                    fb.getBouquet()[i] = name;
                } else if (name.equalsIgnoreCase("daisy") || name.equalsIgnoreCase("Daisy")) {
                    name = daisy.getName();
                    fb.getBouquet()[i] = name;
                } else if (name.equalsIgnoreCase("tulip") || name.equalsIgnoreCase("Tulip")) {
                    name = tulip.getName();
                    fb.getBouquet()[i] = name;
                } else {
                    System.out.println("Please, choose between rose, aster, daisy or tulip");
                    fb.getBouquet()[i] = "Unknown object";
                }
            }
            fb.bouquetContain();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Our bouquet cannot be more than " + fb.getBouquet().length);
        } catch (NullPointerException en) {
            System.out.println("Please restart the program and enter correct data");
        }
    }
}
