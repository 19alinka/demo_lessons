package com.ifmo.lesson2;

public class IsInInterval {
    /*
     Создать программу, которая будет проверять попало ли случайно выбранное из отрезка
    [5;155] целое число в интервал (25;100) и сообщать результат на экран.Примеры работы
    программы:
    Число 113 не содержится в интервале (25,100) Число 72 содержится в интервале (25,100) 
    Число 25 не содержится в интервале (25,100) Число 155 не содержится в интервале (25,100) 
     */
    public static void main(String[] args) {
        int rnd = randomInt();

        String inInterval = isInInterval(rnd);

        // TODO implement
        System.out.println(inInterval);
    }

    public static int randomInt() {
        // TODO implement
        int d = (int) (Math.random() * (155 - 5) + 5);
        return d;
    }

    public static String isInInterval(int rnd) {
        // TODO implement
        if (rnd > 24 && rnd < 101)
            return ("Число " + rnd + " содержится в интервале (25,100)");
        if (rnd > 4 && rnd < 25)
            return ("Число " + rnd + " не содержится в интервале (25,100)");
        if (rnd > 100 && rnd < 156)
            return ("Число " + rnd + " не содержится в интервале (25,100)");
        return "";
    }

}
