package com.ifmo.lesson3;

import java.util.Arrays;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers1();
        int[] randomNumbers2 = randomNumbers2();
        System.out.println(Arrays.toString(randomNumbers1));
        System.out.println(Arrays.toString(randomNumbers2));
        // TODO implement

        int average1 = average1(randomNumbers1);
        int average2 = average2(randomNumbers2);
        if (average1 > average2)
            System.out.println("В первом массиве среднее арифмитическое больше");
        if (average2 > average1)
            System.out.println("Во втором массиве среднее арифмитическое больше");
        if (average2 == average1)
            System.out.println("Среднее арифмитическое двух массивов равны");

        // TODO implement
    }

    public static int[] randomNumbers1() {
        // TODO implement
        int[] randomNumbers1 = new int[5];
        for (int i = 0; i < randomNumbers1.length; i++) {
            int d = (int) (Math.random() * (5 - 0) + 0);
            randomNumbers1[i] = d;
        }
        return randomNumbers1;
    }
    public static int[] randomNumbers2() {
        // TODO implement
        int[] randomNumbers2 = new int[5];
        for (int i = 0; i < randomNumbers2.length; i++) {
            int d = (int) (Math.random() * (5 - 0) + 0);
            randomNumbers2[i] = d;
        }
        return randomNumbers2;
    }

    public static int average1(int[] randomNumbers1) {
        // TODO implement
        int [] average1 = Arrays.copyOf(randomNumbers1, 5);
        int average = 0;
        for (int i = 0; i < average1.length; i++)
            average = average + average1[i];
        return average / 5;

    }
    public static int average2(int[] randomNumbers2) {
        // TODO implement
        int [] average1 = Arrays.copyOf(randomNumbers2, 5);
        int average = 0;
        for (int i = 0; i < average1.length; i++)
            average = average + average1[i];
        return average / 5;
    }
}
