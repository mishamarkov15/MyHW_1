package laba_4_1_exc_6;

public class Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getIncome(boolean for_year) {
        if (for_year) {
            return income * 12;
        } else {
            return income;
        }
    }
}
