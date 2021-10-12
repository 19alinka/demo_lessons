package com.ifmo.lesson2;

public class Progression {
    /*
     Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     1000 1003 1006 1009 1012 1015 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int a = 1000, b = 1000; b < 10000; a++, b += 3) {
            System.out.println(b);
        }
    }
}
