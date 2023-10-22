package laba_4_1_exc_9;


public class FurnitureShop {
    Furniture[] shop;

    public FurnitureShop() {
        fill();
    }

    public void fill() {
        shop = new Furniture[10];
        for (int i= 0 ; i < 10; ++i) {
            if ((int)(Math.random() * 10) % 2 == 0) {
                shop[i] = new Table(Math.random() * 10, "Черный", 2500.50);
            } else {
                shop[i] = new Sofa(Math.random() * 10, "Красный",  6700.99);
            }
        }
    }

    public void buildFurniture() throws InterruptedException {
        for (Furniture furniture : shop) {
            furniture.build();
        }
    }

    public void showAll() {
        for (Furniture furniture : shop) {
            System.out.println(furniture);
        }
    }

}
