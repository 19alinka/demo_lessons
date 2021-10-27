package com.ifmo.lesson3;

import java.util.Arrays;

public class Random8 {
    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
    в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
    экран на отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        System.out.println(Arrays.toString(randomNumbers));
        // TODO implement

        int[] replacedWithZeros = replaceWithZeros(randomNumbers);
        System.out.println(Arrays.toString(replacedWithZeros));
        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[8];
        for (int i = 0; i < randomNumbers.length; i++) {
            int d = (int) (Math.random() * (10 - 1) + 1);
            randomNumbers[i] = d;
        }
        return randomNumbers;
    }

    public static int[] replaceWithZeros(int[] randomNumbers) {
        // TODO implement
        int[] replacedWithZeros = Arrays.copyOf(randomNumbers, 8);
            for (int i = 0; i < replacedWithZeros.length; i++) {
                if (i % 2 == 1) replacedWithZeros[i] = 0;
            }
        return replacedWithZeros;
    }
}
