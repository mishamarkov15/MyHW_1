package laba_8_exc_15;

import java.util.Scanner;

public class Solution {
    public static void solution(int number) {
        if (number == 0) {
            return;
        }
        System.out.printf("%d ", number % 10);
        solution(number / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt());
    }
}
