package com.grupoodo.corp.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.grupogodo.corp.training.MathUtils;
import com.grupogodo.corp.training.Point;

public class MathUtilsTest {
    
    private static final double DOUBLE_ASSERT_DELTA = 0.0D;
    
    @Test
    public void whenICalculateMCDOf36And24_Returns12() {
        int number1 = 36;
        int number2 = 24;
        int expected = 12;
        int result = MathUtils.mcd(number1, number2);
        assertEquals(expected, result);
    }
    
    @Test
    public void whenICalculateMCMOf36And24_Returns72() {
        int number1 = 24;
        int number2 = 36;
        int expected = 72;
        int result = MathUtils.mcm(number1, number2);
        assertEquals(expected, result);
    }
    
    @Test
    public void whenIAskForEuclidanDistanceOfPoint1OnYAxis_ThenReturns1() {
        Point origin = Point.newWithAllCoordinates(0.0, 0.0);
        Point point1inYAxis = Point.newWithAllCoordinates(0.0, 1.0);
        Double expected = 1.0D;
        assertDoubleExactly(expected, MathUtils.euclideanDistance(origin, point1inYAxis));
    }
    
    @Test
    public void givenAPointWithMultipleDimensions_WhenIAskForEuclidanDistance_ThenReturns3() {
        Point origin = Point.newWithAllCoordinates(0.0, 0.0, 0.0);
        Point point1inYAxis = Point.newWithAllCoordinates(2.0, 2.0, 1.0);
        Double expected = 3.0D;
        assertDoubleExactly(expected, MathUtils.euclideanDistance(origin, point1inYAxis));
    }
    
    private void assertDoubleExactly(double expected, double actual) {
        assertEquals(expected, actual, DOUBLE_ASSERT_DELTA);
    }
}
