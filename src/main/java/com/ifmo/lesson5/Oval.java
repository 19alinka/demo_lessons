package com.ifmo.lesson5;

//public class Oval extends Circle {
//    //protected double r1;
//
//    public Oval(double r, double r1){
//        super(r, r1);
//    }
//
//    @Override
//    public double area () {
//        return r * r1;
//    }
//}
public class Oval extends Circle {
    protected double b;

    public Oval( double a, double b){
        super(a);
        this.b = b;
    }

    @Override
    public double area () {
        return p * a * b;
    }
}
