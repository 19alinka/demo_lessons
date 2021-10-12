package com.ifmo.lesson2;

public class NonNegativeSequence {
    /*
    Создайте программу, выводящую на экран все неотрицательные элементы
    последовательности 90 85 80 75 70 65 60 ….
     */
    public static void main(String[] args) {
        // TODO implement
        for (int a = 90, e = 90; e > 0; a--, e -=5 ) {
            System.out.println(e + " ");
        }
    }
}
