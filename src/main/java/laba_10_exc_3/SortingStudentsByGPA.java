package laba_10_exc_3;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private Student[] students;

    SortingStudentsByGPA() {}

    SortingStudentsByGPA(Student[] students) {
        this.students = new Student[students.length];
        System.arraycopy(students, 0, this.students, 0, students.length);
    }

    public void setArray() {
        Random rand = new Random();
        students = new Student[Math.abs(rand.nextInt() % 91) + 10];
        for (int i = 0; i < students.length; ++i) {
            students[i] = new Student("Student", "Clever " + i, "IT", Math.abs(rand.nextInt()) % 5 + 1, "A" + i, Math.abs(rand.nextInt() % 301));
        }
    }

    public static void merge(Student arr[], int l, int m, int r) {
        Comparator<Student> comparator = new StudentGPAComparator().thenComparing(new StudentSurnameComparator());
        int n1 = m - l + 1;
        int n2 = r - m;

        Student L[] = new Student[n1];
        Student R[] = new Student[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (comparator.compare(R[j], L[i]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private static void sort(Student arr[], int l, int r) {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public void merge_sort() {
        sort(students, 0, students.length - 1);
    }


    int partition(Student[] arr, int low, int high) {
        Comparator<Student> comparator = new StudentGPAComparator().thenComparing(new StudentSurnameComparator());

        Student pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comparator.compare(pivot, arr[j]) <= 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void qs(Student[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            qs(arr, begin, partitionIndex - 1);
            qs(arr, partitionIndex + 1, end);
        }
    }

    public void quickSort() {
        qs(students, 0, students.length - 1);
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static SortingStudentsByGPA mergeStudents(Student[] lhs, Student[] rhs) {
        Student[] arr = new Student[lhs.length + rhs.length];
        for (int i = 0; i < lhs.length; ++i) {
            arr[i] = lhs[i];
        }
        for (int i = 0; i < rhs.length; ++i) {
            arr[i + lhs.length] = rhs[i];
        }
        return new SortingStudentsByGPA(arr);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA studentsByGPA1 = new SortingStudentsByGPA();
        studentsByGPA1.setArray();
        SortingStudentsByGPA studentsByGPA2 = new SortingStudentsByGPA();
        studentsByGPA2.setArray();

        System.out.println("Students 1:\n" +
                "-----------");
        studentsByGPA1.outArray();

        System.out.println("Students 2:\n" +
                "-----------");
        studentsByGPA2.outArray();

        SortingStudentsByGPA together = mergeStudents(studentsByGPA1.students, studentsByGPA2.students);

        System.out.print("Выберите способ сортировки:\n1. quick sort\n2. merge sort\nВаш выбор: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number < 1 || number > 2) {
            System.out.print("Повторите ввод: ");
            number = sc.nextInt();
        }

        switch (number) {
            case 1:
                together.quickSort();
                break;
            case 2:
                together.merge_sort();
                break;
        }
        together.outArray();
    }
}
