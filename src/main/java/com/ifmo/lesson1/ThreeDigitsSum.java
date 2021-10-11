package com.ifmo.lesson1;

public class ThreeDigitsSum {
    /*
    В переменной n хранится натуральное трёхзначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
     */
    public static void main(String[] args) {
        int n = 123;

        int sum = sum(n);

        System.out.println(sum);
    }

    public static int sum(int n) {
        // TODO implement
        int n1 = (n / 10) % 10;
        int n2 = n % 10;
        int n3 = n / 100;
        return n1 + n2 + n3;
    }
}
