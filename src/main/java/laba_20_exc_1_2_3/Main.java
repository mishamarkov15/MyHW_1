package laba_20_exc_1_2_3;

public class Main {
    public static void main(String[] args) {
        TestClass<String, Integer, Double> object = new TestClass<>("Hello", 25, 3.14);
        object.showDataTypesName();
    }
}
