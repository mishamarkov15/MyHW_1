package laba_24_exc_1;

public class ConcreteFactory implements ComplexAbstractFactory {
    private int real;
    private int image;

    ConcreteFactory() {
        real = 0;
        image = 0;
    }

    ConcreteFactory(int re, int im) {
        real = re;
        image = im;
    }

    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
