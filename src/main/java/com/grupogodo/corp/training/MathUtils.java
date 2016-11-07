package com.grupogodo.corp.training;


public class MathUtils {
    public static int mcm(int a, int b) {
        return a*(b/ mcd(a, b));
    }
    
    public static int mcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
