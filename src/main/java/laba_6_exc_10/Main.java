package laba_6_exc_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");
        int size = sc.nextInt();

        Shop shop = new Shop();
        shop.fillArray(size);
        shop.showAllComputers();

        System.out.println("Вставка компьютера в конец массива\n" +
                           "----------------------------------");
        shop.addComputer();
        shop.showAllComputers();

        System.out.println("Тестирование поиска\n" +
                           "-------------------");
        Computer computer = new Computer();
        computer.scan();
        int found = shop.findComputer(computer.getMark(), computer.getMonitor(), computer.getMemory(), computer.getProcessor());
        if (found == -1) {
            System.out.println("Компютер не найден");
        } else {
            System.out.println("Компютер найден");
        }


        System.out.println("Удаление компьютера из конца\n" +
                           "----------------------------");
        shop.popBackComputer();
        shop.showAllComputers();
    }
}
