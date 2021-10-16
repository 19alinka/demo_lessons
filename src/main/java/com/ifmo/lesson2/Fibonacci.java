package com.ifmo.lesson2;

public class Fibonacci {
    /*
     Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
     первый и второй члены последовательности равны единицам, а каждый следующий — сумме
     двух предыдущих.
     */
    public static void main(String[] args) {
        // TODO implement
        int e = 1;
        for (int a = 1; a < 12; a++) {
            e += e;

           // System.out.println(e);

        }
        int a = 1;
        int b = 1;

        for (int i = 0; i < 11; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;

        }
    }
}
