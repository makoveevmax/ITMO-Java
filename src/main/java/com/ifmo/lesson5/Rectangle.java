package com.ifmo.lesson5;

public class Rectangle extends Square{

    double side2;

    public Rectangle(double side, double side2) {
        super(side);
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side * side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area() +
                '}';
    }
}
