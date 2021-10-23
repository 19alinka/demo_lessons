package com.ifmo.lesson3;

import java.util.Arrays;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray1 = unevenArray1();
        System.out.println(Arrays.toString(unevenArray1));
        int[] unevenArray2 = unevenArray2();
        System.out.println(Arrays.toString(unevenArray2));
        // TODO implement
    }

    public static int[] unevenArray1() {
        // TODO implement
        int[] unevenArray1 = new int[50];

        for (int e = 0; e < unevenArray1.length; e++) {
            unevenArray1[e] = 1 + (e * 2);
        }
        return unevenArray1;
    }

    public static int[] unevenArray2() {
        // TODO implement
        int[] unevenArray2 = new int[50];

        for (int e = 49; e >= 0; e--) {
            unevenArray2[e] = 99 - (e * 2);
        }
        return unevenArray2;
    }
}
