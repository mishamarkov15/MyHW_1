package org.example;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double square() {
        return width * height;
    }
}
