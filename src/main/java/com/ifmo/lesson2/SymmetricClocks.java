package com.ifmo.lesson2;

public class SymmetricClocks {
    /*
    Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько
    раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация
    для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
     */
    public static void main(String[] args) {

        System.out.println(symmetricTimes());
    }

    public static int symmetricTimes() {
        // TODO implement
        int sum = 0;
        for (int e = 0; e <= 24; e++) {
            int a = e / 10;
            int x = e % 10;
            int s = a + x;
            for (int r = 0; r <= 60; r++) {
                int q = r / 10;
                int p = r % 10;
                int d = q + p;
                if (s == d) sum++;
            }
        }
            return sum;
        }

}
