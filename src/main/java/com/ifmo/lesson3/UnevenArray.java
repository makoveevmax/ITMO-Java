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

        System.out.print(Arrays.toString(unevenArray));
    }

    public static int[] unevenArray() {
        int[] array = new int[50];
        int count = 1;
        for (int i = 0; i < 50; i++) {
            array[i] = count;
            count += 2;
        }
        int[] array2 = Arrays.copyOf(array, 50);

        for (int i =0; i < array2.length/2; i++) {
            int temp =  array2[i];
            array2[i] = array2[array2.length - 1 - i];
            array2[array2.length - 1 - i] = temp;
        }


        return IntStream.concat(Arrays.stream(array), Arrays.stream(array2)).toArray();
    }
}
