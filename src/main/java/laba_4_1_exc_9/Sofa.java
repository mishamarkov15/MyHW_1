package laba_4_1_exc_9;

public class Sofa extends Furniture{
    public Sofa(double volume, String color, double price) {
        super(volume, color, price);
    }

    @Override
    public void build() throws InterruptedException {
        System.out.println("Собираю шкаф цвета " + color + " и объема " + volume + "...");
        Thread.sleep(2000);
        System.out.println("Завершена сборка стола цвета " + color + " и объема " + volume + ".");
    }
}
