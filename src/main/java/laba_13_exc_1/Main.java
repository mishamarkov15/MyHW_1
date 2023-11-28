package laba_13_exc_1;

public class Main {
    public static void processString(String s) {
        System.out.printf("Last char: %c\n", s.charAt(s.length() - 1));
        System.out.printf(s.endsWith("!!!") ? "Ends with '!!!'\n" : "Doesn't ends with '!!!'\n");
        System.out.printf(s.startsWith("I like") ? "Starts with 'I like'\n" : "Doesn't starts with 'I like'\n");
        System.out.printf(s.contains("Java") ? "Contains 'Java'\n" : "Doesn't contains 'Java'\n");
        System.out.printf("'Java' position in '%s': %d\n", s, s.indexOf("Java"));

        System.out.printf("'a' to 'o': %s\n", s.replace('a', 'o'));
        System.out.printf("Upper: %s\n", s.toUpperCase());
        System.out.printf("Lower: %s\n", s.toLowerCase());

        String word_to_cut = "Java";
        if (s.contains(word_to_cut)) {
            var start_index = s.indexOf(word_to_cut);
            System.out.printf("Substring: %s\n", s.substring(start_index,start_index + word_to_cut.length()));
        }
    }
    public static void main(String[] args) {
        processString("I like Java!!!");
    }
}
