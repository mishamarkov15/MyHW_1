package laba_9_exc_3;

import java.util.Random;

public class Sorting {

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

    public static Student[] studentscpy(Student[] dst, Student[] src) {
        Student[] res = new Student[dst.length + src.length];
        for (int i = 0; i < dst.length; ++i) {
            res[i] = dst[i];
        }
        for (int i = 0; i < src.length; ++i) {
            res[dst.length + i] = src[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Student[] students1 = random_students();
        Student[] students2 = random_students();

        System.out.println("Before students 1:");
        printArray(students1);

        System.out.println("Before students 2:");
        printArray(students2);

        Student[] res = studentscpy(students1, students2);

        SortingStudentsByGPA studentsByGPA = new SortingStudentsByGPA();
        studentsByGPA.merge_sort(res);
        System.out.println("\nAfter:");
        printArray(res);
    }
}
