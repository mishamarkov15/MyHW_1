package laba4_1_exc_7;

import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[10];
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            int randomNum = rand.nextInt((1) + 1);
            if (randomNum == 0) {
                humans[i] = new SchoolBoy();
            } else {
                humans[i] = new Student();
            }
        }

        System.out.println("Школьники");
        for (Human human : humans) {
            if (Objects.equals(human.getType(), "SchoolBoy")) {
                System.out.println("Школьник");
            }
        }

        System.out.println("Студенты");
        for (Human human : humans) {
            if (Objects.equals(human.getType(), "Student")) {
                System.out.println("Студент");
            }
        }
    }
}

