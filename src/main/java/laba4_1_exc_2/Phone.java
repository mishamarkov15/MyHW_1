package laba4_1_exc_2;

public class Phone {
    private String number;
    private String model;
    private double weight; // gramms

    // Пункт 9
    public Phone() {
        number = null;
        model = null;
        weight = 0.0;
    }

    //  Пункт 8
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    // Пункт 7, 10
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }


    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        this.receiveCall(callerName);
        System.out.println("Номер: " + callerNumber + "\n");
    }

    public void sendMessage(String... args) {
        System.out.println("Сообщение будет отправлено на следующие номера телефонов:");
        for (String number : args) {
            System.out.println(number);
        }
    }
}
