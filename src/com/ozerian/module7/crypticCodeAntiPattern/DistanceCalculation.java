package com.ozerian.module7.crypticCodeAntiPattern;

public class DistanceCalculation {
    public static void main(String[] args) {
        Point point1 = new Point(9, 7);
        Point point2 = new Point(6, 8);

        point1.getDistance(point2);
        point2.getDistance(point1);

    }
}
