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
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(isIncreasingSequence(randomNumbers));
    }

    public static int[] randomNumbers() {
        int[] randomGenerator = new int[4];
        for (int i = 0; i < 4; i++) {
            int randomNumber = (int) (Math.random()*90 +10);
            randomGenerator[i] = randomNumber;
        }

        return randomGenerator;
    }

    public static boolean isIncreasingSequence(int[] randomNumbers) {
        for (int i = 1; i < randomNumbers().length; i++)

            if (randomNumbers[i - 1] > randomNumbers[i])
                return false;
        return true;
    }
}
