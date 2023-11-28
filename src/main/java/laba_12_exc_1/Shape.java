package laba_12_exc_1;

import java.awt.*;

abstract public class Shape {
    protected Color color;
    protected int positionX;
    protected int positionY;

    abstract public Color getColor();
    abstract public int getPositionX();
    abstract public int getPositionY();

    abstract public void draw(Graphics g);
}
