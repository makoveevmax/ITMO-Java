package com.ifmo.lesson5;

public class Square  extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area() +
                '}';
    }
}
