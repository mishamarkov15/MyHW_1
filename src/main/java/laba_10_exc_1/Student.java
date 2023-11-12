package laba_10_exc_1;

import java.util.Comparator;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int grade;
    private String group;

    private int GPA;


    Student(String name, String surname, String specialization, int grade, String group, int GPA) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.grade = grade;
        this.group = group;
        this.GPA = GPA;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getSpecialization() { return specialization; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int getGrade() { return grade; }

    public void setGrade(int grade) { this.grade = grade; }

    public String getGroup() { return group; }

    public void setGroup(String group) { this.group = group; }

    public int getGPA() { return GPA; }

    public void setGPA(int GPA) { this.GPA = GPA; }

    @Override
    public String toString() {
        return "%s %s, %s %s-%d (GPA %d)".formatted(name, surname, specialization, group, grade, GPA);
    }
}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student lhs, Student rhs) {
        return lhs.getGPA() - rhs.getGPA();
    }
}

class StudentSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student lhs, Student rhs) {
        return lhs.getSurname().compareTo(rhs.getSurname());
    }
}