package com.ifmo.lesson5;

public class Ellipse extends Circle {
    double radius2;

    public Ellipse(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    @Override
    public double area() {
       return Math.PI * radius * radius2;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "area=" + area() +
                '}';
    }
}
