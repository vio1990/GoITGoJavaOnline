package com.ozerian.module6.bouquet;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose();
        Aster aster = new Aster();
        Tulip tulip = new Tulip();
        Daisy daisy = new Daisy();

        FlowerBouquet fb = new FlowerBouquet(4);

        try {
            fb.addFlower(daisy, 0);
            fb.addFlower(tulip, 1);
            fb.addFlower(rose, 2);
            fb.addFlower(rose, 3);
            fb.addFlower(rose, 5);
            fb.bouquetContain();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Our bouquet cannot be more than " + fb.getBouquet().length);
        }

    }
}
