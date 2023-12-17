package laba_20_exc_4;

public class Calculator {
    public static<T extends Number, E extends Number> Double sum(T lhs, E rhs) {
        return lhs.doubleValue() + rhs.doubleValue();
    }

    public static<T extends Number, E extends Number> Double subtraction(T lhs, E rhs) {
        return lhs.doubleValue() - rhs.doubleValue();
    }

    public static<T extends Number, E extends Number> Double multiply(T lhs, E rhs) {
        return lhs.doubleValue() * rhs.doubleValue();
    }

    public static<T extends Number, E extends Number> Double divide(T lhs, E rhs) {
        return lhs.doubleValue() / rhs.doubleValue();
    }
}
