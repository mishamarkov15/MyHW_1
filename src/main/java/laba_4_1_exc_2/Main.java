package laba_4_1_exc_2;

public class Main {
    public static void main(String[] args) {
        // Пункты 1, 2, 5
        Phone p1 = new Phone(), p2 = new Phone("+7 (666) 999-10-01", "iPhone 15 Pro Max"), p3 = new Phone("+7 (111) 900-00-00", "iPhone 15", 1250);
        System.out.printf("""
                Phone 1
                -------
                Number: %s
                Model: %s
                Weight: %.2fkg
                                
                """, p1.getNumber(), p1.getModel(), p1.getWeight() / 1000.0);
        System.out.printf("""
                Phone 2
                -------
                Number: %s
                Model: %s
                Weight: %.2fkg
                                
                """, p2.getNumber(), p2.getModel(), p2.getWeight() / 1000.0);
        System.out.printf("""
                Phone 3
                -------
                Number: %s
                Model: %s
                Weight: %.2fkg
                                
                """, p3.getNumber(), p3.getModel(), p3.getWeight() / 1000.0);

        // Пункты 6
        p1.receiveCall("Steve Jobs", "+7 (999) 876-12-12");
        p2.receiveCall("Larry Page");
        p3.receiveCall("Sergey Brin", "+7 (205) 890-00-90");

        // Пункт 14
        p1.sendMessage("+7 (999) 876-12-12", "+7 (205) 890-00-90", "+7 (666) 999-10-01");
    }
}
