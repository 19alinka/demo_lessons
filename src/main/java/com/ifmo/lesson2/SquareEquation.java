package com.ifmo.lesson2;

import java.util.Arrays;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 2;
        double b = -9;
        double c = 9;

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        // TODO implement
        int d = (int) ((b * b) - (4 * a * c));
        if (d < 0) {
            System.out.println("Корней нет");
        }
        if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Корень квадратного уровнения = " + r);
        }
        if (d > 0) {
            double e = (-b + Math.sqrt(d)) / (2 * a);
            double y = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Первый корень квадратного уровнения = " + e);
            System.out.println("Первый корень квадратного уровнения = " + y);
        }
        return null;
    }
}
