package com.ifmo.lesson2;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        // TODO implement
        int d = (int) (Math.random() * (999 - 100) + 100);
        return d;
    }

    public static String largestDigit(int rnd) {
        // TODO implement
        int n1 = (rnd / 10) % 10;
        int n2 = rnd % 10;
        int n3 = rnd / 100;
        if (n1 >= n2 & n1 > n3 || n1 > n2 & n1 >= n3) {
        } else {
            if (n2 > n1 & n2 >= n3) {
                return ("В числе " + rnd + " наибольшая цифра " + n2 + ".");
            } else {
                return ("В числе " + rnd + " наибольшая цифра " + n3 + ".");
            }
        }
        String s = "В числе " + rnd + " наибольшая цифра " + n1 + ".";
        return s;
    }
}