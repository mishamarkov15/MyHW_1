package laba_13_exc_3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building; // Корпус
    private String flat; // Квартира

    public Address() {
    }

    public void parseAddress(String src) {
        var words = src.split(", ");
        for (int i = 0; i < words.length; ++i) {
            switch (i) {
                case 0 -> country = words[i];
                case 1 -> region = words[i];
                case 2 -> city = words[i];
                case 3 -> street = words[i];
                case 4 -> house = words[i];
                case 5 -> building = words[i];
                case 6 -> flat = words[i];
            }
        }
    }

    public void parseAddress(String src, String delimeter) {
        var tokenizer = new StringTokenizer(src, delimeter);
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            switch (i) {
                case 0 -> country = tokenizer.nextToken();
                case 1 -> region = tokenizer.nextToken();
                case 2 -> city = tokenizer.nextToken();
                case 3 -> street = tokenizer.nextToken();
                case 4 -> house = tokenizer.nextToken();
                case 5 -> building = tokenizer.nextToken();
                case 6 -> flat = tokenizer.nextToken();
                default -> tokenizer.nextToken();
            }

            ++i;
        }
    }

    @Override
    public String toString() {
        return "Страна: %s\nРегион: %s\nГород: %s\nУлица: %s\nДом: %s\nСтроение: %s\nКвартира: %s".formatted(country, region, city, street, house, building, flat);
    }
}
