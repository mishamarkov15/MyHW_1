package laba_4_1_exc_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(), b = new Matrix();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ввод матрицы a\n" +
                           "--------------");
        a.inputMatrix();
        System.out.println("Ввод матрицы b\n" +
                "--------------");
        b.inputMatrix();

        System.out.println("a + b");
        Matrix res = a.sum(b);
        res.show();

        int k;
        System.out.print("Введите целое число k, на которое надо умножить матрицу: ");
        k = sc.nextInt();
        System.out.println("a *= k");
        a.multiplyByValue(k);
        a.show();

        System.out.println("a * b");
        a.multiplyByMatrix(b).show();
    }
}
