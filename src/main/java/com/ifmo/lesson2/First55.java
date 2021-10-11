package com.ifmo.lesson2;

public class First55 {
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        // TODO implement

        for (int a = 1, i = 1; a < 56; i += 2, a++) {
            System.out.println(i + " ");
        }
    }
}
