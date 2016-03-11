package com.ozerian.core.module4.calculation.distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    private Point point;
    private Point point2;

    @Test
    public void testGetDistance() throws Exception {
        final int x = 1;
        final int y = 1;
        final int x2 = 2;
        final int y2 = 2;

        point = new Point(x, y);
        point2 = new Point(x2, y2);

        double distance = Math.sqrt((Math.pow(x - x2, 2) + Math.pow(y - y2, 2)));
        double expectedValue = distance;
        double actualValue = point.getDistance(point2);

        assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void testGetY() throws Exception {
        final int y = 2;
        final int expectedValue = y;

        point = new Point(0, y);
        final int actualValue = point.getY();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetX() throws Exception {
        final int x = 5;
        final int expectedValue = x;

        point = new Point(x, 0);
        final int actualValue = point.getX();
        assertEquals(expectedValue, actualValue);
    }
}