package com.grupogodo.corp.training;

import java.util.ArrayList;
import java.util.Arrays;

import lombok.val;

public class Point {

    ArrayList<Double> cartesianCoordinates = new ArrayList<Double>();
    
    public static Point newWithAllCoordinates(Double...doubles) {
        val point = new Point();
        point.addAllCoordinates(doubles);
        return point;
    }
    
    public void modifyDimension(int dimension, Double value) {
        cartesianCoordinates.set(dimension-1, value);
    }
    
    public Double getCoordinateByDimension(int dimension) {
        return cartesianCoordinates.get(dimension-1);
    }
    
    public int getDimensions() {
        return cartesianCoordinates.size();
    }
    
    private void addAllCoordinates(Double...doubles) {
        cartesianCoordinates.addAll(Arrays.asList(doubles));
    }
}
