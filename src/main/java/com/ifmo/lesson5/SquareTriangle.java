package com.ifmo.lesson5;

public class SquareTriangle extends Square {

    protected final double c = 0.5;
    protected double b;

    public SquareTriangle(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double area () {
        return c * a * b;
    }
}
