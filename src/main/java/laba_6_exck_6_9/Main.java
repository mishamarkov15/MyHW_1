package laba_6_exck_6_9;

import java.util.Random;

public class Main {
    static public void fillPrintables(Printable[] printables) {
        Random rand = new Random();
        for (int i = 0; i < printables.length; ++i) {
            if (rand.nextInt() % 2 == 1) {
                printables[i] = new Book();
            } else {
                printables[i] = new Shop();
            }
        }
    }
    static public void main(String[] args) {
        Printable[] printables = new Printable[5];
        fillPrintables(printables);
        for (int i = 0; i < printables.length; ++i) {
            printables[i].print();
        }
    }
}
