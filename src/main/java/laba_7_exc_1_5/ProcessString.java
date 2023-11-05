package laba_7_exc_1_5;

public class ProcessString implements StringInterface {
    private String src;

    public ProcessString(String str) {
        src = str;
    }

    @Override
    public int symbolsCount(char sym) {
        int res = 0;
        for (int i = 0; i < src.length(); ++i) {
            if (src.charAt(i) == sym) {
                ++res;
            }
        }
        return res;
    }

    @Override
    public String oddIndexesString() {
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < src.length(); i += 2) {
            res.append(src.charAt(i));
        }
        return res.toString();
    }

    @Override
    public String reverse() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < src.length(); ++i) {
            res.append(src.charAt(src.length() - 1 - i));
        }
        return res.toString();
    }

    @Override
    public String toString() {
        return src;
    }
}
