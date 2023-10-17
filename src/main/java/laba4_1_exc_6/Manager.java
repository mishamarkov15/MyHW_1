package laba4_1_exc_6;

public class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome(boolean for_year) {
        return super.getIncome(for_year) + (for_year ? averageSum * 12 : averageSum);
    }
}
