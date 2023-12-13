package laba_24_exc_1;

public class Complex {
    private double re;
    private double im;

    public Complex(double real, double imaginary) {
        re = real;
        im = imaginary;
    }

    @Override
    public String toString() {
        return "%.2f ".formatted(re) + (im < 0 ? "-" : "+") + " %.2f".formatted(im);
    }
}
