package com.ifmo.lesson3;

import java.sql.SQLOutput;
import java.util.Arrays;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();


        // TODO implement
    }

    public static int[] evenArray() {
        // TODO implement
        int[] evenArray = new int[10];

        for (int e = 0; e < evenArray.length; e++) {
            evenArray[e] = 2 + (e * 2);
            System.out.print(evenArray[e] + " ");
        }
        for (int e = 0; e < evenArray.length; e++) {
            evenArray[e] = 2 + (e * 2);
            System.out.println(evenArray[e] + "");
            }

        return evenArray;
    }
}
