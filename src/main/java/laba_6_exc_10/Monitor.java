package laba_6_exc_10;

import java.util.Scanner;

public class Monitor implements Scannable {
    public double diagonalInches;
    public int height;
    public int width;

    public Monitor(double diagonalInches, int height, int width) {
        this.diagonalInches = diagonalInches;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "%.1f'', %dx%d pixels".formatted(diagonalInches, width, height);
    }

    @Override
    public void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите диагональ (''): ");
        this.diagonalInches = sc.nextDouble();
        System.out.print("Введите кол-во пикселей по ширине: ");
        this.width = sc.nextInt();
        System.out.print("Введите кол-во пикселей по высоте: ");
        this.height = sc.nextInt();
    }
}
