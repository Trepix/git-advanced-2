package com.grupoodo.corp.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.grupogodo.corp.training.MathUtils;

public class MathUtilsTest {
    
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
}
