package com.ozerian.module3.bouquet;

public abstract class Flower {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "|\t" + name + "\t|\t" + color + "\t|";
    }
}
