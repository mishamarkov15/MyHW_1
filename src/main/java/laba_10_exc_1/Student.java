package laba_10_exc_1;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int grade;
    private String group;

    Student(String name, String surname, String specialization, int grade, String group) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.grade = grade;
        this.group = group;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String setSpecialization() { return specialization; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int setGrade() { return grade; }

    public void setGrade(int grade) { this.grade = grade; }

    public String setGroup() { return group; }

    public void setGroup(String group) { this.group = group; }

    @Override
    public String toString() {
        return "%s %s, %s %s-%d".formatted(name, surname, specialization, group, grade);
    }
}
