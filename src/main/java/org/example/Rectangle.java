package org.example;

public class Rectangle extends Shape {

    private double w;
    private double h;

    public Rectangle(double height, double width) {
        w = width;
        h = height;
    }

    @Override
    public double getArea() {
        return w * h;
    }

    @Override
    public double getPerimeter() {
        return 2 * (w + h);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle: " + w + " " + h;
    }
}
