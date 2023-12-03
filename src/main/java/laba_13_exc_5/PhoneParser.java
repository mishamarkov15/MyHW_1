package laba_13_exc_5;

public class PhoneParser {
    private String part_1;
    private String part_2;
    private String part_3;

    public PhoneParser(String src) {
        if (src.startsWith("+")) {
            part_1 = src.substring(2, 5);
            part_2 = src.substring(5, 8);
            part_3 = src.substring(8);
        } else {
            part_1 = src.substring(1, 4);
            part_2 = src.substring(4, 7);
            part_3 = src.substring(7);
        }
    }

    @Override
    public String toString() {
        return "+7%s-%s-%s".formatted(part_1, part_2, part_3);
    }
}
