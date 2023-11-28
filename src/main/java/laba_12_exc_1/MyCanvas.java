package laba_12_exc_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyCanvas extends JFrame {

    public void paint(Graphics g) {
        super.paint(g);

        Shape[] shapes = new Shape[20];
        Random random = new Random();
        for (int i = 0; i < shapes.length; ++i) {
            int type = Math.abs(random.nextInt()) % 3;
            int color_type = Math.abs(random.nextInt()) % 5;
            Color color = Color.BLACK;
            switch (color_type) {
                case 0:
                    color = Color.RED;
                    break;
                case 1:
                    color = Color.GREEN;
                    break;
                case 2:
                    color = Color.BLUE;
                    break;
                case 3:
                    color = Color.PINK;
                    break;
                case 4:
                    color = Color.ORANGE;
                    break;
            }

            switch (type) {
                case 0:
                    shapes[i] = new Circle(color, Math.abs(random.nextInt()) % 500, Math.abs(random.nextInt()) % 500, Math.abs(random.nextInt()) % 100 + 10);
                    break;
                case 1:
                    shapes[i] = new Rectangle(color, Math.abs(random.nextInt()) % 500, Math.abs(random.nextInt()) % 500, Math.abs(random.nextInt()) % 100 + 10, Math.abs(random.nextInt()) % 100 + 10);
                    break;
                case 2:
                    shapes[i] = new Square(color, Math.abs(random.nextInt()) % 500, Math.abs(random.nextInt()) % 500, Math.abs(random.nextInt()) % 100 + 10);
                    break;
            }
            shapes[i].draw(g);
        }
    }

    public MyCanvas() {
        super("Figures");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyCanvas canvas = new MyCanvas();
    }
}
