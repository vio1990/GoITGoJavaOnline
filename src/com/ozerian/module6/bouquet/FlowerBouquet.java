package com.ozerian.module6.bouquet;

public class FlowerBouquet {
    private String[] bouquet;


    public FlowerBouquet(int size) {
        this.bouquet = new String[size];
    }

    public String[] getBouquet() {
        return bouquet;
    }

    public void addFlower(Rose rose, int position) {
        getBouquet()[position] = rose.getName();
    }

    public void addFlower(Aster aster, int position) {
        getBouquet()[position] = aster.getName();
    }

    public void addFlower(Daisy daisy, int position) {
        getBouquet()[position] = daisy.getName();
    }

    public void addFlower(Tulip tulip, int position) {
        getBouquet()[position] = tulip.getName();
    }

    public void bouquetContain() {
        System.out.print("Our bouquet include: ");
        for (int i = 0; i < getBouquet().length; i++) {
            System.out.print(getBouquet()[i] + " ");
        }
        System.out.println();
    }

}

