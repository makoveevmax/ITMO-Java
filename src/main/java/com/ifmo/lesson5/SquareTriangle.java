package com.ifmo.lesson5;

public class SquareTriangle extends Shape{
    double base;

    public SquareTriangle(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * Math.pow(base, 2);
    }

    @Override
    public String toString() {
        return "SquareTriangle{" +
                "area=" + area() +
                '}';
    }
}
