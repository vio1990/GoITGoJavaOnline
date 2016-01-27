package com.ozerian.module4.calculation.area;

public class GeometricFigure {
    private double circleRadius;
    private double rectangleLength;
    private double rectangleWidth;
    private double triangleSide1;
    private double triangleSide2;
    private double triangleSide3;

    public double circleArea() {
        double circleArea = circleRadius * circleRadius * Math.PI;
        return circleArea;
    }

    public double rectangleArea() {
        double rectangleArea = rectangleWidth * rectangleLength;
        return rectangleArea;
    }

    public double triangleArea() {
        double perimeter = triangleSide1 + triangleSide2 + triangleSide3;
        double triangleArea = Math.sqrt(perimeter * (perimeter - triangleSide1) * (perimeter - triangleSide2) * (perimeter - triangleSide3));
        return triangleArea;
    }

    GeometricFigure(double radius) {
        this.circleRadius = radius;
    }

    GeometricFigure(double length, double width) {
        this.rectangleLength = length;
        this.rectangleWidth = width;
    }

    GeometricFigure(double side1, double side2, double side3) {
        this.triangleSide1 = side1;
        this.triangleSide2 = side2;
        this.triangleSide3 = side3;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public double getRectangleLength() {
        return rectangleLength;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public double getTriangleSide1() {
        return triangleSide1;
    }

    public double getTriangleSide2() {
        return triangleSide2;
    }

    public double getTriangleSide3() {
        return triangleSide3;
    }
}
