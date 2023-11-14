package laba_11_exc_3;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        Student student = new Student("Ivan", "Ivanov", "IT", 2, "23B", 299, calendar.getTime());

        System.out.printf("toString: %s\n", student);
        System.out.printf("toString(SHORT): %s\n", student.toString(DATE_FORMAT.SHORT));
        System.out.printf("toString(NORMAL): %s\n", student.toString(DATE_FORMAT.NORMAL));
        System.out.printf("toString(LONG): %s\n", student.toString(DATE_FORMAT.LONG));
    }
}
