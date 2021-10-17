package com.ifmo.lesson5;

public class Triangle extends SquareTriangle{
    double height;

    public Triangle(double base, double height) {
        super(base);
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area() +
                '}';
    }
}
