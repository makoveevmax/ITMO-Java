package com.ifmo.lesson2;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        var random = Math.random() * 900 +100;

        return (int) random;
    }

    public static String largestDigit(int rnd) {

        int max = 0;
        int rndCopy = rnd;

        while (rndCopy != 0) {
            int reminder = rndCopy % 10;
            max = Math.max(reminder, max);
            rndCopy = rndCopy / 10;
        }

        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
