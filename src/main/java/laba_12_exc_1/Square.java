package laba_12_exc_1;

import java.awt.*;

public class Square extends Shape {
    private int size;

    public Square(Color color, int positionX, int positionY, int size) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(positionX, positionY, size, size);
    }
}
