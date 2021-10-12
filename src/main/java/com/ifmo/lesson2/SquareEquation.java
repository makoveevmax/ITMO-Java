package com.ifmo.lesson2;

import java.util.Arrays;

public class SquareEquation {
    /*
     В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
     будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
     либо сообщать, что корней нет.
     */
    public static void main(String[] args) {
        double a = 3.0;
        double b = -18;
        double c = 27;

        double[] roots = squareEquationRoots(a, b, c);

        System.out.println(Arrays.toString(roots));
    }

    /*
    Возвращает массив из двух корней или null, если таковых нет.
     */
    public static double[] squareEquationRoots(double a, double b, double c) {
        double result = Math.pow(b, 2) - 4.0 * a * c;
        double roots[] = new double[2];
        if (result > 0d) {
            roots[0] = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            roots[1] = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            return  roots;
        } else if (result == 0d) {
            roots[0] = -b / (2.0 * a);
            return new double[]{roots[0]};
        } else {
            return null;
        }
    }
}
