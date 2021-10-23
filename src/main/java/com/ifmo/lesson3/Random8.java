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
        System.out.println(Arrays.toString(replaceWithZeros(randomNumbers)));
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
        int[] replaceWithZeros = Arrays.copyOf(randomNumbers, 8);
        if (randomNumbers[0] % 2 == 1) randomNumbers[0] = 0;
        if (randomNumbers[1] % 2 == 1) randomNumbers[1] = 0;
        if (randomNumbers[2] % 2 == 1) randomNumbers[2] = 0;
        if (randomNumbers[3] % 2 == 1) randomNumbers[3] = 0;
        if (randomNumbers[4] % 2 == 1) randomNumbers[4] = 0;
        if (randomNumbers[5] % 2 == 1) randomNumbers[5] = 0;
        if (randomNumbers[6] % 2 == 1) randomNumbers[6] = 0;
        if (randomNumbers[7] % 2 == 1) randomNumbers[7] = 0;
        return replaceWithZeros;
    }
}
