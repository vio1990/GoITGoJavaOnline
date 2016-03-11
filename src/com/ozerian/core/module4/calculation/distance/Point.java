package com.ozerian.core.module4.calculation.distance;

public class Point {
    private int x;
    private int y;

    public double getDistance(Point point){
        double distance = Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
        return distance;
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
