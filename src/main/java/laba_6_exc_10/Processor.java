package laba_6_exc_10;

import java.util.Scanner;

public class Processor implements Scannable {
    private int threads;
    private int frequencyMhz;

    public Processor() {

    }

    public Processor(int threads, int frequencyMhz) {
        this.threads = threads;
        this.frequencyMhz = frequencyMhz;
    }

    @Override
    public String toString() {
        return "%d threads, %d Mhz".formatted(threads, frequencyMhz);
    }

    @Override
    public void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во ядер: ");
        this.threads = sc.nextInt();
        System.out.print("Введите частоту процессора: ");
        this.frequencyMhz = sc.nextInt();
    }
}

