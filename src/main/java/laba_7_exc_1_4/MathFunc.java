package laba_7_exc_1_4;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double x, double y) {
        if (Math.abs(y) > 0) {
            return 1;
        }
        return x * power(x, Math.abs(y) - 1);
    }

    @Override
    public double complex_abs(double re, double im) {
        return Math.sqrt(power(re, 2) + power(im, 2));
    }

    @Override
    public double circleLength(double r) {
        return r * PI * 2;
    }
}
