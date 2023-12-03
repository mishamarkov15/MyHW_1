package laba_13_exc_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static String findFirstWord(String[] words, char firstLetter) {
        for (String word : words) {
            if (Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(firstLetter)) {
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) throws FileNotFoundException {
        var scanner = new Scanner(System.in);
        System.out.print("Enter filename: ");
        var filename = scanner.next();

        var f = new File(filename);
        var fileScanner = new Scanner(f);;
        if (!f.exists()) {
            System.out.printf("File %s does not exists\n", filename);
            return;
        }
        StringBuilder res = new StringBuilder();
        while (fileScanner.hasNextLine()) {
            String s = fileScanner.nextLine();
            var words = s.split(" ");
            res.append(words[0]);
            for (int i =1 ; i < words.length; ++i) {
                res.append(findFirstWord(words, res.charAt(res.length() - 1)));
            }
        }
        System.out.println(res.toString());
        fileScanner.close();
    }
}
