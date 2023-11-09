package laba_9_exc_2;

public class Student implements Comparable<Student> {
    int id;
    String name;

    int GPA;

    public Student(int id, String name, int GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "%d: %s (GPA %d)".formatted(id, name, GPA);
    }

    @Override
    public int compareTo(Student o) {
        return o.GPA - GPA;
    }
}
