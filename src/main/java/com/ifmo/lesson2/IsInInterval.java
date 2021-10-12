package com.ifmo.lesson2;

import org.w3c.dom.ls.LSOutput;

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

        System.out.println(inInterval);
    }

    public static int randomInt() {

        return (int) (Math.random() *151  + 5);
    }

    public static String isInInterval(int rnd) {
        if (rnd > 25 && rnd  < 100 ) {
            return "Число " + rnd + " содержится в интервале (25,100)";
        } else
        return "Число " + rnd + " не содержится в интервале (25,100)";
    }
}
