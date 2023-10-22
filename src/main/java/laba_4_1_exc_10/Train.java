package laba_4_1_exc_10;

public class Train extends Vehicle{
    @Override
    public int getTravelTime(double distanceKM) {
        return (int) (5000 * distanceKM);
    }

    @Override
    public double getTravelPrice(double distanceKM) {
        return 250 * distanceKM;
    }
}
