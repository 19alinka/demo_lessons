package com.ifmo.lesson3;

import java.util.Arrays;

public class Fibonacci20 {
    /*
    Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем,
    что первый и второй члены последовательности равны единицам, а каждый следующий —
    сумме двух предыдущих.
     */
    public static void main(String[] args) {
        int[] fibonacciNumbers = fibonacciNumbers();
        System.out.println(Arrays.toString(fibonacciNumbers));
        // TODO implement
    }

    public static int[] fibonacciNumbers() {
        // TODO implement
        int[] fibonacciNumbers = new int[20];

        int a = 0;
        int b = 1;

        for (int i = 1; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[0] = 1;
            fibonacciNumbers[i] = (a + b);
            a = b;
            b = fibonacciNumbers[i];
        }

        return fibonacciNumbers;
    }
}
