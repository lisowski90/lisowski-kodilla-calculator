package com.kodilla.testing.shape;

public class Triangle implements Shape  {
    double a;
    double h;
    String figureName;

    @Override
    public String getShapeName() {
        return figureName;
    }

    @Override
    public double getField() {
        double result = (0.5 * a) * h;
        return result;
    }

    public Triangle(double a, double h, String figureName) {
        this.a = a;
        this.h = h;
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }

    @Override
    public String toString() {
        String triangle = getFigureName() + ", field " + getField();
        return triangle;
    }
}
