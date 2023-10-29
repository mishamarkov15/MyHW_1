package laba_6_exc_10;

public class Shop {

    private Computer[] computers;
    public void fillArray(int size) {
        computers = new Computer[size];
        for (int i = 0; i <size; ++i) {
            computers[i].scan();
        }
    }

    public void addComputer() {
        Computer[] tmp = new Computer[computers.length];
        for (int i = 0; i < tmp.length; ++i) {
            tmp[i] = computers[i];
        }
        computers = new Computer[computers.length + 1];
        for (int i = 0; i < tmp.length; ++i) {
            computers[i] = tmp[i];
        }
        computers[tmp.length].scan();
    }

    public void popBackComputer() {
        if (computers.length == 0) {
            System.out.println("Удалять нечего\n");
            return;
        }
        Computer[] tmp = new Computer[computers.length];
        for (int i = 0; i + 1 < computers.length; ++i) {
            tmp[i] = computers[i];
        }
        computers = new Computer[computers.length - 1];
        for (int i = 0; i < computers.length; ++i) {
            computers[i] = tmp[i];
        }
    }
}
