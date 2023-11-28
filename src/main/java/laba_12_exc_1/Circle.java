package laba_12_exc_1;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int positionX, int positionY, int radius) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
        this.radius = radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public int getPositionX() {
        return positionX;
    }

    @Override
    public int getPositionY() {
        return positionY;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(positionX, positionY, radius, radius);
    }
}
