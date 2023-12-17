package laba_20_exc_4;

import java.util.Random;

public class Main {
    public static void show(Integer[] data) {
        for (int i =0 ; i < data.length; ++i) {
            System.out.printf("%d ", data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Random random = new Random();
//        Integer[] data = new Integer[10];
//        for (int i = 0; i < data.length; ++i) {
//            data[i] = random.nextInt() % 100;
//        }
//
//        show(data);
//
//        MinMax<Integer> obj = new MinMax<>(data);
//
//        System.out.printf("Min = %d\nMax = %d\n", obj.getMin(), obj.getMax());

        System.out.println(Calculator.sum(12, 5.6));
        System.out.println(Calculator.subtraction(12.2, 5));
        System.out.println(Calculator.multiply(12.2, 5.6));
        System.out.println(Calculator.divide(2183218392312L, 2345.6));
    }
}
