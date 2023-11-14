package laba_11_exc_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, month, day, hour, minute;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = sc.nextInt();

        System.out.print("Enter month (integer [1, 12]): ");
        month = sc.nextInt();

        System.out.print("Enter day: ");
        day = sc.nextInt();

        System.out.print("Enter hour (integer [0, 23]): ");
        hour = sc.nextInt();

        System.out.print("Enter year (integer [0, 59]): ");
        minute = sc.nextInt();

        // creating calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);

        // creating Date
        Date date = calendar.getTime();

        System.out.println("Calendar: " + calendar.getTime());
        System.out.println("Date: " + date);
    }
}
