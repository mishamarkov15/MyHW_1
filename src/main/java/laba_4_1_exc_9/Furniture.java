package laba_4_1_exc_9;

abstract public class Furniture {
    protected double volume; // Объем
    protected String color;
    protected double price;

    public Furniture() {
        volume = 0.0;
        color = "";
        price = 0.0;
    }

    public Furniture(double volume, String color, double price) {
        this.volume = volume;
        this.price = price;
        this.color = color;
    }

    abstract public void build() throws InterruptedException;
}
