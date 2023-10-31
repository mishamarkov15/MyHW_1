package laba_6_exc_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kelvin, celcium, farengheit;
        System.out.print("Enter kelvin: ");
        kelvin = sc.nextDouble();
        System.out.print("Enter celcium: ");
        celcium = sc.nextDouble();
        System.out.print("Enter farengheit: ");
        farengheit = sc.nextDouble();

        Kelvin k = new Kelvin(kelvin);
        Celcium c = new Celcium(celcium);
        Farengheit f = new Farengheit(farengheit);

        System.out.printf("%.2f kelvin = %.2f celcium\n%.2f kelvin = %.2f farengheit\n", kelvin, k.convert(Temperatures.CELCIUM), kelvin, k.convert(Temperatures.FARENGHEIT));
        System.out.printf("%.2f celcium = %.2f kelvin\n%.2f celcium = %.2f farengheit\n", celcium, c.convert(Temperatures.KELVIN), celcium, c.convert(Temperatures.FARENGHEIT));
        System.out.printf("%.2f farengheit = %.2f celcium\n%.2f farengheit = %.2f kelvin\n", farengheit, f.convert(Temperatures.CELCIUM), farengheit, f.convert(Temperatures.KELVIN));
    }
}
