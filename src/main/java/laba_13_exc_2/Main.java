package laba_13_exc_2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivanov");
        System.out.println(p1.getFullName());

        Person p2 = new Person("Ivan", "Ivanov");
        System.out.println(p2.getFullName());

        Person p3 = new Person("Anna", "Ivanova", "Valerievna");
        System.out.println(p3.getFullName());
    }
}
