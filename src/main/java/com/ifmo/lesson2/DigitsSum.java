package com.ifmo.lesson2;

import java.util.Scanner;

public class DigitsSum {
    /*
    Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
    его цифр (заранее не известно сколько цифр будет в числе).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int digitSum = digitSum(n);

        System.out.println(digitSum);
    }

    public static int digitSum(int n) {
        int sum = 0; //  n = 24
        for (; n != 0; n /= 10) {
            sum += n % 10; // 24 % 10 = 4; 2
            // n = n / 10
        }
        return sum;
    }
}
        // TODO implement


