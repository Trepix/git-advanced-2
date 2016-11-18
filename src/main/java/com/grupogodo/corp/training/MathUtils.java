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
    
    public static double euclideanDistance(Point p1, Point p2) {
        Double result = 0.0;
        for (int i=1; i <= p1.getDimensions(); ++i) {
            result += Math.pow((p2.getCoordinateByDimension(i) - p1.getCoordinateByDimension(i)), 2);   
        }
        return Math.sqrt(result);
    }
}
