package com.ifmo.lesson3;

import java.util.Arrays;

public class Random15 {
    /*
     Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
     Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
     отдельной строке.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        System.out.println(Arrays.toString(randomNumbers));
        // TODO implement

        int [] arr = randomNumbers;

        int evens = evens(randomNumbers);
        System.out.println(evens);
        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[15];
        for (int i = 0; i < randomNumbers.length; i++) {
            int d = (int) (Math.random() * (9 - 0) + 0);
            randomNumbers[i] = d;
        }
        return randomNumbers;
    }

    private static int evens(int[] arr) {
        // TODO implement
        int[] c = Arrays.copyOf(arr, 15);
        int evens = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 == 0) evens++;{
                if (c[i] == 0) evens--;
            }
        }
        return evens;
    }
}
