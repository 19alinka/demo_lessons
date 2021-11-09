package com.ifmo.lesson5;

public class Square extends Shape {
    protected double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area () {
        return a * a;
    }
}
//public class Square extends Circle {
//    public Square(double r) {
//        super(r);
//    }
//    @Override
//    public double area () {
//        return r * r;
//    }
//}
