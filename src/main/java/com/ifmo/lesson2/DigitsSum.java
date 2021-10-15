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

        int digitSum = digitSum2(n);

        System.out.println(digitSum);
    }
    public static int digitSum(int n) {
        for (int a = 0; n != 0; n /= 10) {
            ++a;
            if (a == 3) {
                int n1 = (n / 10) % 10;
                int n2 = n % 10;
                int n3 = n / 100;
                return n1 + n2 + n3;
            }
        }
            return 0;
    }

    public static int digitSum2(int n) {
        int sum = 0;
        for (; n != 0; n /= 10) {
            sum += n % 10;
        }
        return sum;
    }
}
        // TODO implement


