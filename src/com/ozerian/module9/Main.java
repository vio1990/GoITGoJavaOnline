package com.ozerian.module9;

import com.ozerian.module3.bouquet.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> flowerBouquet = new ArrayList<>();
        flowerBouquet.add(new Daisy("Daisy", "white"));
        flowerBouquet.add(new Rose("Rose", "yellow"));
        flowerBouquet.add(new Aster("Aster", "pink"));
        flowerBouquet.add(new Tulip("Tulip", "red "));
        flowerBouquet.add(new Rose("Rosie", "blue"));

        String encodeList = CaesarCipher.caesarEncode(flowerBouquet.toString()
                .replace('\t',' ')
                .replace('|',' ')
                , 3);
        System.out.println(encodeList);

        String decodeList = CaesarCipher.caesarDecode(encodeList, 3);
        System.out.println(decodeList);
    }
}
