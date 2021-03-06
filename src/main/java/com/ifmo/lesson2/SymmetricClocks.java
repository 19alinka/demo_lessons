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
        for (int e = 0; e <= 23; e++) {
            char a = (char) (e / 10);
            char x = (char) (e % 10);
            String s = "" + a + x;
            for (int r = 0; r <= 59; r++) {
                char q = (char) (r / 10);
                char z = (char) (r % 10);
                String d = "" + z + q;
                    if (s.equals(d)) sum++;
            }
        }
            return sum;
        }

}
