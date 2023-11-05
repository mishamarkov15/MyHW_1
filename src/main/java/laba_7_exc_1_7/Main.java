package laba_7_exc_1_7;

import java.util.Random;

public class Main {

    public static Printable[] random_fill() {
        Random rand = new Random();
        Printable[] printables = new Printable[rand.nextInt() % 20 + 10];
        for (int i = 0; i < printables.length; ++i) {
            if (rand.nextInt() % 2 == 0) {
                printables[i] = new Book("Книга " + i , "Автор " + i, 2000 + i);
            } else {
                printables[i] = new Journal("Журнал " + i);
            }
        }
        return printables;
    }

    public static void main(String[] args) {
        Printable[] printables = random_fill();
        printMagazines(printables);
    }

    public static void printMagazines(Printable[] printables) {
        for (int i = 0; i < printables.length; ++i) {
            if (printables[i] instanceof Journal) {
                printables[i].print();
            }
        }
    }
}
