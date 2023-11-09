package laba_9_exc_2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
    }

    int partition(Student arr[], int low, int high) {
        Student pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (compare(arr[j], pivot) <= 0) {
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

    private void qs(Student arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            qs(arr, begin, partitionIndex - 1);
            qs(arr, partitionIndex + 1, end);
        }
    }

    public void quick_sort(Student[] students) {
        qs(students, 0, students.length - 1);
    }

}
