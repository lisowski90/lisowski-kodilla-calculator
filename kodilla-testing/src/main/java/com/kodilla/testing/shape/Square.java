package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Square implements Shape {
    double a;
    String shape;

    @Override
    public String getShapeName() {
        return shape;
    }

    @Override
    public double getField() {
        double result = pow(a, 2);
        return result;
    }

    public Square(double a, String figureName) {
        this.a = a;
        this.shape = figureName;
    }

    @Override
    public String toString() {
        String square = getShapeName() + ", field " + getField();
        return square;
    }
}
