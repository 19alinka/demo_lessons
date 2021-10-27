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
        int[] evenArray1 = evenArray1();
        System.out.println(Arrays.toString(evenArray1));


        int[] evenArray2 = evenArray1();
        System.out.print(Arrays.toString(evenArray2));

        // TODO implement
    }

    public static int[] evenArray1() {
        // TODO implement
        int[] evenArray1 = new int[10];

        for (int e = 0; e < evenArray1.length; e++) {
            evenArray1[e] = 2 + (e * 2);
        }
        return evenArray1;
    }
   /* public static int[] evenArray2() {
        // TODO implement
        int[] evenArray2 = new int[10];
        for (int e = 0; e < evenArray2.length; e++) {
            evenArray2[e] = 2 + (e * 2);
        }
        return evenArray2;
    }*/
}
