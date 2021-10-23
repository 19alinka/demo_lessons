package com.ifmo.lesson3;

import java.util.Arrays;

public class Random12 {
    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
    элемент является в этом массиве максимальным и сообщите индекс его последнего
    вхождения в массив.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        System.out.println(Arrays.toString(randomNumbers));
        // TODO implement

        int max = max(randomNumbers);
        int maxLastIndex = lastIndexOf(randomNumbers, max);
        System.out.println(max);
        System.out.println(maxLastIndex);
        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[12];
        for (int i = 0; i < randomNumbers.length; i++) {
            int d = (int) (Math.random() * (15 - (-15)) + (-15));
            randomNumbers[i] = d;
        }
        return randomNumbers;
    }

    public static int max(int[] randomNumbers) {
        // TODO implement
        int[] c = Arrays.copyOf(randomNumbers(), 12);
        int max = randomNumbers[0];
        for (int j : randomNumbers) {
            if (j > max)
                max = j;
        }
        return max;
    }

    public static int lastIndexOf(int[] randomNumbers, int max) {
        // TODO implement
        int [] y = randomNumbers;
        int maxLastIndex = Arrays.binarySearch(randomNumbers, max);
        return maxLastIndex;
    }
}
