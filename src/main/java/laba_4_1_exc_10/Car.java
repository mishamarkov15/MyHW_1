package laba_4_1_exc_10;

public class Car extends Vehicle{

    @Override
    public int getTravelTime(double distanceKM) {
        return (int) (3660 * distanceKM);
    }

    @Override
    public double getTravelPrice(double distanceKM) {
        return 123.5 * distanceKM;
    }
}
