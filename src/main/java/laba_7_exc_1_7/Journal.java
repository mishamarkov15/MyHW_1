package laba_7_exc_1_7;

public class Journal implements Printable{
    private String name;
    String getName() {
        return name;
    }
    Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Жунал '%s'\n", name);
    }
}
