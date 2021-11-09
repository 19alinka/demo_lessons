package com.ifmo.lesson5;

public class SquareTriangle extends Triangle {

    public SquareTriangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area () {
        return c * a * b;
    }
}
