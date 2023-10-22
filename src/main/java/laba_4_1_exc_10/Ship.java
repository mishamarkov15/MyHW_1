package laba_4_1_exc_10;

public class Ship extends Vehicle {
    @Override
    public int getTravelTime(double distanceKM) {
        return (int) (9000 * distanceKM);
    }

    @Override
    public double getTravelPrice(double distanceKM) {
        return 12000 * distanceKM;
    }
}
