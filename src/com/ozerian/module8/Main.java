package com.ozerian.module8;

import com.ozerian.module3.bouquet.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> flowerBouquet = new ArrayList<>();
        flowerBouquet.add(new Daisy("Daisy", "white"));
        flowerBouquet.add(new Rose("Rose", "yellow"));
        flowerBouquet.add(new Aster("Aster", "pink"));
        flowerBouquet.add(new Tulip("Tulip", "red "));

        ListUtilities.printer(flowerBouquet);
        System.out.println();
        ListUtilities.nameSorter(flowerBouquet);

    }
}
