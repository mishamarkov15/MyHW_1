package laba_11_exc_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Steve Jobs");
        SimpleDateFormat dateFormat = new SimpleDateFormat("h:m:sa y-M-d, E");
        System.out.println("Время получения задания: " + dateFormat.format(d));

        Date deadline = new Date(d.getTime() + (1000 * 86400));
        System.out.println("Время сдачи задания: " + dateFormat.format(deadline));
    }
}
