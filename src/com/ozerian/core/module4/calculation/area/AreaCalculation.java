package com.ozerian.core.module4.calculation.area;

public class AreaCalculation {
    public static void main(String[] args) {
        GeometricFigure circle = new GeometricFigure(4.3);
        GeometricFigure rectangle = new GeometricFigure(3.7, 5.4);
        GeometricFigure triangle = new GeometricFigure(2.6, 5.3, 6.7);

        System.out.printf("The square of rectangle is: %.2f\n", rectangle.rectangleArea());
        System.out.printf("The square of triangle is: %.2f\n",  triangle.triangleArea());
        System.out.printf("The square of circle is: %.2f\n",  circle.circleArea());
    }
}
