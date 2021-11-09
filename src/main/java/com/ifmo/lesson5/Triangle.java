package com.ifmo.lesson5;

public class Triangle extends Shape {
    protected final double c = 0.5;
    protected double a;
    protected double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double area () {
        return c * a * b;
    }
}
