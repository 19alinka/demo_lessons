package com.ifmo.lesson3;

import java.util.Arrays;

public class Random4 {
    /*
    Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в
    строку. Определить и вывести на экран сообщение о том, является ли массив строго
    возрастающей последовательностью.
     */
    public static void main(String[] args) {
        int[] randomNumbers = randomNumbers();
        boolean r = isIncreasingSequence(randomNumbers());
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(r);

        // TODO implement
    }

    public static int[] randomNumbers() {
        // TODO implement
        int[] randomNumbers = new int[4];
        for (int i = 0; i < randomNumbers.length; i++) {
            int d = (int) (Math.random() * (99 - 10) + 10);
            randomNumbers[i] = d;
        }
        return randomNumbers;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        // TODO implement
        if (randomNumbers[0] < randomNumbers[1]
                && randomNumbers[1] < randomNumbers[2]
                && randomNumbers[2] < randomNumbers[3]
                && randomNumbers[3] < randomNumbers[4])
            return true;
            else return false;
    }
}
