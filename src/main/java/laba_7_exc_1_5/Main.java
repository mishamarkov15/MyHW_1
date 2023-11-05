package laba_7_exc_1_5;

public class Main {
    public static void main(String[] args) {
        ProcessString string = new ProcessString("Hello, world!");
        System.out.printf("\"%c\" occurs %d times in string \"%s\"\n", 'l', string.symbolsCount('l'), string.toString());
        System.out.printf("\"%s\" only odd indexes is \"%s\"\n", string.toString(), string.oddIndexesString());
        System.out.printf("\"%s\" reversed is \"%s\"\n", string.toString(), string.reverse());
    }
}
