package org.example;

public class Circle extends Shape {

    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return radius * Math.PI * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String toString() {
        return "Circle: " + radius;
    }
}
