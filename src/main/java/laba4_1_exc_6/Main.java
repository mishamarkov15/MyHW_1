package laba4_1_exc_6;

public class Main {
    public static void main(String[] args) {
        Employer[] employers = new Employer[5];
        employers[0] = new Manager("Steve", "Jobs", 10000000, 63412);
        employers[1] = new Manager("Ilon", "Mask", 31974521, 83925731);
        employers[2] = new Employer("Larry", "Page", 152);
        employers[3] = new Employer("Vladimir", "Purin", 512);
        employers[4] = new Manager("Joe", "Baiden", 32, 900);

        for (Employer employer : employers) {
            System.out.println(employer.getFullName() + ": " + employer.getIncome(false) + "$");
        }
    }
}
