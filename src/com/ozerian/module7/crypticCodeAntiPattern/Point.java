package com.ozerian.module7.crypticCodeAntiPattern;

/*
Cryptic Code anti-pattern. There are the variables with names "x" and "y".
These variable's names was changed for understanding their meanings.
 */
public class Point {
    private int coordinateX;
    private int coordinateY;

    public void getDistance(final Point point) {
        double distance = Math.sqrt(Math.pow(coordinateX - point.coordinateX, 2) + Math.pow(coordinateY - point.coordinateY, 2));
        System.out.printf("The distance between points is %.2f\n", distance);
    }

    Point(final int coordinateX, final int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }
}
