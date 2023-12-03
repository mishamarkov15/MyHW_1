package laba_13_exc_3;

public class Main {
    public static void main(String[] args) {
        Address a = new Address();

        a.parseAddress("Россия, Московский, Москва, Арбат, 1, 1, 77");
        System.out.printf("Тест 1:\n-------\n%s\n", a);

        a.parseAddress("Россия. Ленинградский. Санкт-Петербург. Ленина. 2. 3. 12", ". ");
        System.out.printf("Тест 2:\n-------\n%s\n", a);

        a.parseAddress("Германия; Центральный; Берлин; Фон Бисмарка; 9; 2; 9", "; ");
        System.out.printf("Тест 3:\n-------\n%s\n", a);

        a.parseAddress("Россия, Самарский, Самара, Площадь революции, 65, 1, 1");
        System.out.printf("Тест 4:\n-------\n%s\n", a);
    }
}
