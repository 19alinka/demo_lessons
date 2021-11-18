package com.ifmo.lesson5;

public class Triangle extends Shape {

    protected final double s = 1.7;
    protected double a;

    public Triangle(double a) {
       this.a = a;

    }
    @Override
    public double area () {
        return ((a * a) * s ) / 4;
    }
}
//(a*b*c)/4*r