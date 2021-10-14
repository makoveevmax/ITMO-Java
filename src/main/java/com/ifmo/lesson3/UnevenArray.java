package com.ifmo.lesson3;


import java.util.Arrays;
import java.util.stream.IntStream;

public class UnevenArray {
    /*
    Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем
    этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3
    1)
     */
    public static void main(String[] args) {
        int[] unevenArray = unevenArray();
        System.out.println(Arrays.toString(unevenArray).replaceAll("[\\[\\]\\,]", ""));

    }

    public static int[] unevenArray() {
        int n = 50;
        int count = 1;
        int temp, i;

        int array[] = new int[n];
        for (i = 0; i < n; i++) {
            array[i] = count;
            count += 2;

        }
        for (i = 0; i < n; i++, n--) {
            temp = array[i];
            array[i] = array[n - 1];
            array[n - 1] = temp;

        }
        for (i = 0; i < array.length; i++) {
        }
        return array;
    }
}