package com.ifmo.lesson3;

import java.util.ArrayList;
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
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        IntStream.range(0, unevenArray.length).forEach(i -> stringBuilder.append(unevenArray[i]).append(" "));
        IntStream.iterate(unevenArray.length - 1, i -> i >= 0, i -> i - 1)
                .forEach(i -> stringBuilder1.append(unevenArray[i]).append(" "));
        for (StringBuilder builder : Arrays.asList(stringBuilder, stringBuilder1)) {
            System.out.println(builder.toString().trim());
        }
    }

    public static int[] unevenArray() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 100; i += 2) {
            list.add(i);
        }
        return list.stream().mapToInt(integer -> integer).toArray();
    }
}
