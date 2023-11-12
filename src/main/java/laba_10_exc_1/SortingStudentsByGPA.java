package laba_10_exc_1;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private Student[] students;

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

    public static void main(String[] args) {
        SortingStudentsByGPA studentsByGPA = new SortingStudentsByGPA();
        studentsByGPA.setArray();
        studentsByGPA.outArray();

        System.out.print("Выберите способ сортировки:\n1. quick sort\n2. merge sort\nВаш выбор: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number < 1 || number > 2) {
            System.out.print("Повторите ввод: ");
            number = sc.nextInt();
        }

        switch (number) {
            case 1: studentsByGPA.quickSort(); break;
            case 2: studentsByGPA.merge_sort(); break;
        }
        studentsByGPA.outArray();
    }
}
