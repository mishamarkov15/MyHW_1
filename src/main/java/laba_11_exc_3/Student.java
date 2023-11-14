package laba_11_exc_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

enum DATE_FORMAT {
    SHORT,
    NORMAL,
    LONG,
}

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int grade;
    private String group;

    private int GPA;

    private Date birth_date;


    Student(String name, String surname, String specialization, int grade, String group, int GPA, Date birth_date) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.grade = grade;
        this.group = group;
        this.GPA = GPA;
        this.birth_date = birth_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "%s %s, %s %s-%d (GPA %d)".formatted(name, surname, specialization, group, grade, GPA);
    }

    public String toString(DATE_FORMAT format) {
        SimpleDateFormat dateFormat = null;
        switch (format) {
            case SHORT:
                dateFormat = new SimpleDateFormat("d.M.y");
                break;
            case NORMAL:
                dateFormat = new SimpleDateFormat("d.M.y h:m");
                break;
            case LONG:
                dateFormat = new SimpleDateFormat("d.M.y h:m:s, E");
                break;
        }
        return "%s %s, %s %s-%d (GPA %d) | %s".formatted(name, surname, specialization, group, grade, GPA, dateFormat.format(birth_date));
    }
}

