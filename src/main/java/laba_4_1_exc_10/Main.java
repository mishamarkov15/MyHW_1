package laba_4_1_exc_10;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Aircraft();
        vehicles[1] = new Car();
        vehicles[2] = new Ship();
        vehicles[3] = new Train();
        double sumPrice = 0;
        int travelTime = 0;
        for (int i = 0; i < vehicles.length; ++i) {
            sumPrice += vehicles[0].getTravelPrice(10);
            travelTime += vehicles[0].getTravelTime(10);
        }

        System.out.printf("Стоимость перевозки всеми четырьмя транспортными средствами: %.2f\n" +
                "Длительность перевозки: %d", sumPrice, travelTime);
    }
}
