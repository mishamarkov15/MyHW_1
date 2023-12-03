package laba_13_exc_5;

public class Main {
    public static void main(String[] args) {
        var phone_1 = new PhoneParser("+79998881234");
        System.out.println(phone_1);

        var phone_2 = new PhoneParser("89998881234");
        System.out.println(phone_2);
    }
}
