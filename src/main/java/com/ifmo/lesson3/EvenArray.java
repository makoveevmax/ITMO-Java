package com.ifmo.lesson3;

public class EvenArray {
    /*
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
    сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
    элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
    будет размера.2 4 6 … 18 20246…20
     */
    public static void main(String[] args) {
        int[] evenArray = evenArray();
    }

    public static int[] evenArray() {
        int array[] = new int[10];
        int i = 0;
        int step = 2;

        while (i < 10) {
            array[i] = step;
            step += 2;
            i++;
        }

        for (i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}

