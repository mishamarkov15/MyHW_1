package laba_4_1_exc_8;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        super();
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Circle | " + color + " | width = " + width + " | length = " + length;
    }
}
