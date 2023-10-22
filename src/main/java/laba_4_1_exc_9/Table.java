package laba_4_1_exc_9;

public class Table extends Furniture{
    public Table(double v, String color, double v1) {
        super(v, color, v1);
    }

    @Override
    public void build() throws InterruptedException {
        System.out.println("Собираю стол цвета " + color + "...");
        Thread.sleep(2000);
        System.out.println("Сборка стола цвета " + color + " завершена.");
    }
}
