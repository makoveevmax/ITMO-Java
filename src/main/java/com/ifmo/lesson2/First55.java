package com.ifmo.lesson2;

import java.util.Arrays;

public class First55 {
    /*
    Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */
    public static void main(String[] args) {
        int array[] = new int[55];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] +2;
        }
        System.out.println(Arrays.toString(array));
    }
}
