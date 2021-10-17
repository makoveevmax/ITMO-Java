package com.ifmo.lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(7);
        Shape ellipse = new Ellipse(13, 42);
        Shape rectangle = new Rectangle(8, 12);
        Shape triangle = new Triangle(6, 66);
        Shape squareTriangle = new SquareTriangle(12);
        for (Shape shape : Arrays.asList(circle, square, ellipse,
                rectangle, triangle, squareTriangle)) {
            System.out.println(shape);
        }
    }
}


