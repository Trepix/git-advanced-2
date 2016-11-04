package com.grupoodo.corp.training;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.grupogodo.corp.training.Fibonacci;

public class FibonacciTest {
    
    private static Fibonacci fibonacci;
    private int n = 45;
    
    @Before
    public void initTestSuit() {
        fibonacci = new Fibonacci();
    }
    
    @Test
    public void whenIAskFor45thPositionOfFibonacciSequence_ThenReturn1134903170() {
        long expected = 1134903170L;
        long fibonacciResult = fibonacci.calculate(n);
        assertEquals(expected, fibonacciResult);
    }
    
    @Test(timeout=2000)
    public void whenIAskFor45thPosition_ThenNeedLessThan2Seconds() {
        fibonacci.calculate(n);
    }

}
