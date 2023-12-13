package laba_24_exc_1;

public class Main {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Complex a = ComplexFactory.getComplex(new ConcreteFactory());
        Complex b = ComplexFactory.getComplex(new ConcreteFactory(1, 1), 1, 1);
        System.out.println(a);
        System.out.println(b);
    }
}
