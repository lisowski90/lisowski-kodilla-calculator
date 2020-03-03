package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {
    private double r;
    private String shape;

    @Override
    public String getShapeName() {
        return shape;
    }

    @Override
    public double getField() {
        double result = Math.PI * pow(r, 2);
        return result;
    }

    public Circle(double r, String shape) {
        this.r = r;
        this.shape = shape;
    }

    @Override
    public String toString() {
        String circle = getShapeName() + ", field " + getField();
        return circle;
    }
}
