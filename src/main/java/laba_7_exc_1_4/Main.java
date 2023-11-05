package laba_7_exc_1_4;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println("power(4, 3): " + mc1.power(4, 3));
        System.out.println("complex module 5 + 8i: " + mc1.complex_abs(5, 8));
        System.out.println("circle length (radius = 3): " + mc1.circleLength(3));
    }
}
