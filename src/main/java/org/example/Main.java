package org.example;

import java.util.Scanner;

public class Main {

    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long factorial(int n) {
        long res = 1;
        while (n > 0) {
            res *= n;
            --n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d %d", factorialRecursive(n), factorial(n));
    }
}
