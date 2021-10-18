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
        double[] s = new double[2];
        double d = (int) ((b * b) - (4 * a * c));
        if (d > 0) {
            double e = (-b + Math.sqrt(d)) / (2 * a);
            double y = (-b - Math.sqrt(d)) / (2 * a);
            s[0] = e;
            s[1] = y;
            return s;
        } else if (d == 0) {
            double t = (-b / (2 * a));
            double r = 0;
            s[0] = r;
            s[1] = t;
            return s;
        }
        return null;
    }
}
