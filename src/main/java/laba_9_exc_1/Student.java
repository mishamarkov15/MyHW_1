package laba_9_exc_1;

public class Student implements Comparable<Student> {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "%d: %s".formatted(id, name);
    }

    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }
}
