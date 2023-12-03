package laba_13_exc_4;

import java.util.StringTokenizer;

public class Shirt {
    private String article;
    private String title;
    private String color;
    private String size;

    public Shirt() {
    }

    public void parseInfo(String src) {
        var tokenizer = new StringTokenizer(src, ",");
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            switch (i) {
                case 0 -> article = tokenizer.nextToken();
                case 1 -> title = tokenizer.nextToken();
                case 2 -> color = tokenizer.nextToken();
                case 3 -> size = tokenizer.nextToken();
                default -> tokenizer.nextToken();
            }
            ++i;
        }
    }

    @Override
    public String toString() {
        return "Артикуль: %s\nНазвание: %s\nЦвет: %s\nРазмер: %s".formatted(article, title, color, size);
    }
}
