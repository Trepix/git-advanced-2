package com.grupogodo.corp.training;


public class Fibonacci {
    public long calculate(int n) {
        if (n < 2) return n;
        else return calculateForNBiggerThan2(n);
    }
    
    private long calculateForNBiggerThan2(int n) {
        long current = 1;
        long next = 1;
        
        for (int i=0; i < n-1; ++i) {
            long aux = current;
            current = next;
            next += aux;
        }
        
        return current;
    }
}
