package com.ifmo.lesson5;

//public class Circle extends Shape {
//    protected double r;
//    protected double r1;
//
//    public Circle(double r, double r1){
//        this.r = r;
//        this.r1 = r1;
//    }
//    @Override
//    public double area () {
//        return r * r;
//    }
//}
public class Circle extends Shape {
    protected final double p = 3.14;
    protected double a;


    public Circle(double a) {
        this.a = a;
    }
    @Override
    public double area () {

        return p * (a * a);
    }
}
