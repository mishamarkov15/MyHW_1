package org.example;


import java.util.concurrent.ThreadLocalRandom;

public class Tester {

    public static Shape[] createRandomArrayOfShapes(int size) {
        Shape figures[] = new Shape[size];
        for (int i = 0; i < size; ++i) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 3); // [0, 2]
            switch (randomNum) {
                case 0: figures[i] = new Circle(Math.random() * ThreadLocalRandom.current().nextInt(1, 100)); break;
                case 1: figures[i] = new Rectangle(Math.random() * ThreadLocalRandom.current().nextInt(1, 100), Math.random() * ThreadLocalRandom.current().nextInt(1, 100)); break;
                case 2: figures[i] = new Square(Math.random() * ThreadLocalRandom.current().nextInt(1, 100)); break;
            }
        }
        return figures;
    }

    public static void main(String[] args) {
        Shape figures[] = createRandomArrayOfShapes(10);
        for (Shape figure : figures) {
            System.out.println(figure.getType());
            System.out.printf("Area = %.2f\nPerimeter = %.2f\ntoString: %s\n\n", figure.getArea(), figure.getPerimeter(), figure.toString());
        }
    }
}