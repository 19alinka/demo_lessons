package com.ifmo.lesson2;

public class IntsOrdering {
    /*
     В три переменные a, b и c явно записаны программистом три целых попарно неравных
     между собой числа. Создать программу, которая переставит числа в переменных таким
     образом, чтобы при выводе на экран последовательность a, b и c оказалась строго
     возрастающей.

     Числа в переменных a, b и c: 3, 9, -1
     Возрастающая последовательность: -1, 3, 9

     Числа в переменных a, b и c: 2, 4, 3
     Возрастающая последовательность: 2, 3, 4

     Числа в переменных a, b и c: 7, 0, -5
     Возрастающая последовательность: -5, 0, 7
     */
    public static void main(String[] args) {
        int a = 3, b = 9, c = -1;

        String ordering = ordering(a, b, c);

        System.out.println(ordering);
    }

    public static String ordering(int a, int b, int c) {
        // TODO implement
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        if (a < b && a < c) a1 = a;
        if (b < a && b < c) a1 = b;
        if (c < a && c < b) a1 = c;
        if (a > b && a > c) c1 = a;
        if (b > a && b > c) c1 = b;
        if (c > a && c > b) c1 = c;
        if (a > a1 && a < c1) b1 = a;
        if (b > a1 && b < c1) b1 = b;
        if (c > a1 && c < c1) b1 = c;

        return "Числа в переменных a, b и c: " + a + ", " + b + ", " + c + "\n" +
                "Возрастающая последовательность: " + a1 + ", " + b1 + ", " + c1;
    }
}
