package org.example;

abstract public class Thing {
    protected double price;

    protected Category category;

    protected String title;

    @Override
    public String toString() {
        return title + "\nКатегория: " + category.toString() + "\nЦена: " + price + "₽";
    }
}
