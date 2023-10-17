package laba4_1_exc_4;

import laba4_1_exc_2.Phone;

import java.util.Scanner;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix() {
        rows = 0;
        cols = 0;
    }

    public Matrix(int rows, int cols) {
        data = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    public void inputMatrix() {
        int rows, cols;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        rows = sc.nextInt();

        System.out.print("Введите количество столбцов: ");
        cols = sc.nextInt();

        data = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                data[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix sum(Matrix other) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                res.data[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return res;
    }

    public void multiplyByValue(int value) {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                data[i][j] *= value;
            }
        }
    }

    public void show() {
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                System.out.print(data[i][j] + " ");
            }
            System.out.print('\n');
        }
    }

    public Matrix multiplyByMatrix(Matrix other) {
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                for (int k = 0; k < cols; ++k) {
                    res.data[i][j] += data[i][k] * other.data[k][j];
                }
            }
        }
        return res;
    }
}
