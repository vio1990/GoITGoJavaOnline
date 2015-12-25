package com.ozerian.module4.calculation.distance;

public class Point {
    private int x;
    private int y;

    public void getDistance(Point point){
        double distance = Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
        System.out.printf("The distance between points is %.2f\n", distance);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
