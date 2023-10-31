package laba_6_exc_10;

import java.util.Scanner;

enum Mark {
    APPLE,
    IBM,
    MICROSOFT
}

public class Computer implements Scannable {
    private Mark mark;
    private Monitor monitor;
    private Memory memory;
    private Processor processor;

    public Mark getMark() {
        return mark;
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите марку:\n" +
                "1. Apple\n" +
                "2. IBM\n" +
                "3. Microsoft\nMark: ");
        int mark = sc.nextInt();
        while (mark < 1 || mark > 3) {
            System.out.println("Неверный ввод. Повторите.");
            mark = sc.nextInt();
        }
        switch (mark) {
            case 1: this.mark = Mark.APPLE; break;
            case 2: this.mark = Mark.IBM; break;
            case 3: this.mark = Mark.MICROSOFT; break;
        }

        System.out.println("Ввод монитора\n");
        monitor = new Monitor();
        monitor.scan();

        System.out.println("Ввод памяти\n");
        memory = new Memory();
        memory.scan();

        System.out.println("Ввод процессора\n");
        processor = new Processor();
        processor.scan();
    }
}
