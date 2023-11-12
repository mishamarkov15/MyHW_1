package laba_11_exc_2;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar current_date = Calendar.getInstance();
        System.out.printf("Current date: %02d:%02d:%02d %4d.%02d.%02d%n\n", current_date.get(Calendar.HOUR), current_date.get(Calendar.MINUTE), current_date.get(Calendar.SECOND), current_date.get(Calendar.YEAR), current_date.get(Calendar.MONTH), current_date.get(Calendar.DAY_OF_MONTH));
        Calendar user_date = Calendar.getInstance();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter minute: ");
        int minute = sc.nextInt();
        System.out.print("Enter second: ");
        int second = sc.nextInt();

        user_date.set(Calendar.YEAR, year);
        user_date.set(Calendar.MONTH, month);
        user_date.set(Calendar.DAY_OF_MONTH, day);
        user_date.set(Calendar.HOUR, hour);
        user_date.set(Calendar.MINUTE, minute);
        user_date.set(Calendar.SECOND, second);

        if (current_date.after(user_date)) {
            System.out.println("Your date was before our date");
        } else {
            System.out.println("Your date was after our date");
        }
    }
}
