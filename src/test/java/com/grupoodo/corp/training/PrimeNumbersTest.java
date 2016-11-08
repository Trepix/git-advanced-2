package com.grupoodo.corp.training;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.grupogodo.corp.training.PrimeNumbers;

public class PrimeNumbersTest {
    
    private static PrimeNumbers primeNumbers;
    
    @Before
    public void initTestSuit() {
        primeNumbers = new PrimeNumbers();
    }
    
    @Test
    public void whenICallIsPrimeOf1_ReturnsTrue() {
        int number = 1;
        assertTrue(primeNumbers.isPrime(number));
    }
    
    @Test
    public void whenICallIsPrimeOnBigIntegerPrime_ThenReturnsTrue() {
        int number = 37831;
        assertTrue(primeNumbers.isPrime(number));
    }
}
