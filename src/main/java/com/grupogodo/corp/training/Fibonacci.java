package com.grupogodo.corp.training;


public class Fibonacci {
    public long calculate(int n) {
        return n < 2 ? n : calculate(n - 1) + calculate(n - 2);  
    }
}
