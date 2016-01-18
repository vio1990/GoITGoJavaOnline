package com.ozerian.module8;

import com.ozerian.module3.bouquet.Flower;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListUtilities {

    public static void printer(ArrayList<Flower> objectList) {
        System.out.println("|\t" + "Name" + "\t|\t" + "Color" + "\t|");
        objectList.
                stream().
                forEach(System.out::println);
    }

    public static void nameSorter(ArrayList<Flower> objectList) {
        System.out.println("|\t" + "Name" + "\t|\t" + "Color" + "\t|");
        objectList.
                stream().
                sorted((flower1, flower2) -> flower1.getName().compareTo(flower2.getName())).
                forEach(System.out::println);

    }

}
