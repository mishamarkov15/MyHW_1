package laba_12_exc_1;

import java.awt.*;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Color color, int positionX, int positionY, int width, int height) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, width, height);
    }
}

