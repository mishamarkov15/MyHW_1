package laba_7_exc_1_4;

public class MathCircle implements MathCalculable {
    private double r;
    public MathCircle() {

    }
    public MathCircle(double radius) {
        r = radius;
    }
    @Override
    public double power(double x, double y) {
        return 0;
    }

    public double getSquare() {
        return r * PI;
    }
}
