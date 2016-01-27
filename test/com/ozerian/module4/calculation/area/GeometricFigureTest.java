package com.ozerian.module4.calculation.area;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeometricFigureTest {
    private GeometricFigure circle;
    private GeometricFigure triangle;
    private GeometricFigure rectangle;

    @Test
    public void testCircleArea() throws Exception {
        final double radius = 2.5;
        circle = new GeometricFigure(radius);

        final double circleArea = (radius * radius * Math.PI);
        final double resultCircleArea = circle.circleArea();
        assertEquals(resultCircleArea, circleArea, 0);
    }

    @Test
    public void testRectangleArea() throws Exception {
        final double length = 2.3;
        final double width = 2.5;

        rectangle = new GeometricFigure(length, width);

        final double rectangleArea = length * width;
        final double resultRectangleArea = rectangle.rectangleArea();
        assertEquals(rectangleArea, resultRectangleArea, 0);

    }

    @Test
    public void testTriangleArea() throws Exception {
        final double side1 = 1.7;
        final double side2 = 1.8;
        final double side3 = 2.5;

        triangle = new GeometricFigure(side1, side2, side3);

        double perimeter = side1 + side2 + side3;
        double triangleArea = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
        final double resultTriangleArea = triangle.triangleArea();
        assertEquals(triangleArea, resultTriangleArea, 0);
    }

    @Test
    public void testGetCircleRadius() throws Exception {
        final double radius = 2.7;
        final double expectedValue = radius;

        circle = new GeometricFigure(radius);
        final double actualValue = circle.getCircleRadius();

        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void testGetRectangleLength() throws Exception {
        final double length = 2.5;
        final double expectedValue = length;

        rectangle = new GeometricFigure(length, 0);
        final double actualValue = rectangle.getRectangleLength();

        assertEquals(expectedValue, actualValue, 0);

    }

    @Test
    public void testGetRectangleWidth() throws Exception {
        final double width = 1.5;
        final double expectedValue = width;

        rectangle = new GeometricFigure(0, width);
        final double actualValue = rectangle.getRectangleWidth();

        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void testGetTriangleSide1() throws Exception {
        final double side1 = 1.7;
        final double expectedValue = side1;

        triangle = new GeometricFigure(side1, 0, 0);
        final double actualValue = triangle.getTriangleSide1();

        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void testGetTriangleSide2() throws Exception {
        final double side2 = 3.7;
        final double expectedValue = side2;

        triangle = new GeometricFigure(0, side2, 0);
        final double actualValue = triangle.getTriangleSide2();

        assertEquals(expectedValue, actualValue, 0);

    }

    @Test
    public void testGetTriangleSide3() throws Exception {
        final double side3 = 6.7;
        final double expectedValue = side3;

        triangle = new GeometricFigure(0, 0, side3);
        final double actualValue = triangle.getTriangleSide3();

        assertEquals(expectedValue, actualValue, 0);
    }
}