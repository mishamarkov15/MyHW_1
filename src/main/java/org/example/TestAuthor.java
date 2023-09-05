package org.example;

import java.util.Scanner;

public class TestAuthor {

    public static void main(String[] args) {
        Author john = new Author("John Doe", "123@example.ru", 'm');
        System.out.print("Author before email changing\n" + john.toString() + '\n');

        System.out.print("\nEnter new email: ");
        String new_email;
        Scanner sc = new Scanner(System.in);
        new_email = sc.next();

        john.setEmail(new_email);
        System.out.print("Author after email changing\n" + john.toString());
    }
}
