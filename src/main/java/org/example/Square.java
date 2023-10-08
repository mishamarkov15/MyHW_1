package org.example;

public class Square extends Shape {

    private double a;

    public Square(double side) {
        a = side;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square: " + a;
    }
}
