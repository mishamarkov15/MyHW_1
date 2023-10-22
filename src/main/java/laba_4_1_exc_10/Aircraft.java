package laba_4_1_exc_10;

public class Aircraft extends Vehicle {
    @Override
    public int getTravelTime(double distanceKM) {
        return (int) (1600 * distanceKM);
    }

    @Override
    public double getTravelPrice(double distanceKM) {
        return 1200 * distanceKM;
    }
}
