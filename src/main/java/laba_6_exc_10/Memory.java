package laba_6_exc_10;

import java.util.Scanner;

public class Memory implements Scannable {
    public int amountGB;
    public int frequencyMhz;

    public Memory(int amountGB, int frequencyMhz) {
        this.amountGB = amountGB;
        this.frequencyMhz = frequencyMhz;
    }

    @Override
    public String toString() {
        return "%d GB, %d Mhz".formatted(amountGB, frequencyMhz);
    }

    @Override
    public void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во ГБ памяти: ");
        this.amountGB = sc.nextInt();
        System.out.print("Введите частоту памяти: ");
        this.frequencyMhz = sc.nextInt();
    }
}

