package laba_13_exc_2;

public class Person {
    private String name;
    private String surname;
    private String middle_name;

    public Person(String surname) {
        this.surname = surname;
        this.name = "";
        this.middle_name = "";
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.middle_name = "";
    }

    public Person(String name, String surname, String middle_name) {
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
    }

    public String getFullName() {
        String res = "";
        if (!surname.isEmpty()) {
            res += surname;
        }
        if (!name.isEmpty()) {
            res += (" " + name.charAt(0)).toUpperCase() + ".";
        }
        if (!middle_name.isEmpty()) {
            res += (" " + middle_name.charAt(0)).toUpperCase() + ".";
        }
        return res;
    }
}
