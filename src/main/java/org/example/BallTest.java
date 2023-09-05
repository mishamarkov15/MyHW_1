package org.example;

import java.util.Scanner;

public class BallTest {
    public static void main(String[] args) {
        Ball b_default = new Ball();
        System.out.print("Default ctor ball: " + b_default.toString() + "\n");
        b_default.move(12.56, 87.99);
        System.out.print("Default ctor ball after move: " + b_default.toString());

        double x, y;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter x: ");
        x = sc.nextDouble();

        System.out.print("Enter y: ");
        y = sc.nextDouble();

        Ball b = new Ball(x, y);
        System.out.print("Param ctor ball: " + b.toString() + "\n");
        b.move(-12.5, 99.9234519);
        System.out.print("Default ctor ball after move: " + b.toString());

    }
}
