package laba_9_exc_2;

import java.util.Random;

public class Sorting {
    public static void quick_sort(Student[] students) {

    }

    public static Student[] random_students() {
        Random rand = new Random();
        Student[] students = new Student[Math.abs(rand.nextInt() % 20 + 10)];
        for (int i = 0; i < students.length; ++i) {
            students[i] = new Student(Math.abs(rand.nextInt() % 200), "Student " + rand.nextInt() % 10000, Math.abs(rand.nextInt() % 100));
        }
        return students;
    }

    public static void printArray(Student[] students) {
        for (int i = 0; i < students.length; ++i) {
            System.out.println(students[i]);
        }
    }

    public static void main(String[] args) {
        Student[] students = random_students();
        System.out.println("Before:");
        printArray(students);

        selectionSort(students);
        System.out.println("\nAfter:");
        printArray(students);

    }
}
