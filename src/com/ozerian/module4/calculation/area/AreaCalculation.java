package com.ozerian.module4.calculation.area;

public class AreaCalculation {
    public static void main(String[] args) {
        GeometricFigure circle = new GeometricFigure(4.3);
        GeometricFigure rectangle = new GeometricFigure(3.7, 5.4);
        GeometricFigure triangle = new GeometricFigure(2.6, 5.3, 6.7);

        circle.circleArea();
        rectangle.rectangleArea();
        triangle.triangleArea();
    }
}
