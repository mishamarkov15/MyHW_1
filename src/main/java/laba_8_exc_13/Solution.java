package laba_8_exc_13;

import java.util.Scanner;

public class Solution {

    public static void solution(int number) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            return;
        } else {
            if (number % 2 != 0) {
                System.out.println(num);
            }
            solution(number + 1);
        }
    }

    public static void main(String[] args) {
        solution(1);
    }
}
