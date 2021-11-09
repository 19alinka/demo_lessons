package com.ifmo.lesson5;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle( 4);
        System.out.println(circle.area());

        Oval oval = new Oval(3, 2);
        System.out.println(oval.area());

        Square square = new Square(2);
        System.out.println(square.area());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle.area());

        Triangle triangle = new Triangle(3,5);
        System.out.println(triangle.area());

        SquareTriangle squareTriangle = new SquareTriangle(3,3);
        System.out.println(squareTriangle.area());
    }
}
