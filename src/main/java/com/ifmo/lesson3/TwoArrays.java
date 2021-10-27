package com.ifmo.lesson3;

import java.util.Arrays;
import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();
        System.out.println(Arrays.toString(randomNumbers1));
        System.out.println(Arrays.toString(randomNumbers2));
        // TODO implement

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);
        if (average1 > average2)
            System.out.println("В первом массиве среднее арифмитическое больше");
        if (average2 > average1)
            System.out.println("Во втором массиве среднее арифмитическое больше");
        if (average2 == average1)
            System.out.println("Среднее арифмитическое двух массивов равны");

        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            int d = random.nextInt(6);
            randomNumbers[i] = d;
        }
        return randomNumbers;
    }

    public static int average(int[] randomNumbers) {
        // TODO implement
        int average = 0;
        for (int i = 0; i < randomNumbers.length; i++)
            average = average + randomNumbers[i];
        return average / 5;
    }
}
