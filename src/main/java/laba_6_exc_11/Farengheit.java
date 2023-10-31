package laba_6_exc_11;

public class Farengheit implements Convertable {
    private double temperature;
    public Farengheit(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
    @Override
    public double convert(Temperatures other) {
        if (other == Temperatures.FARENGHEIT) {
            return temperature;
        } else if (other == Temperatures.KELVIN) {
            return (temperature - 32.) * (5. / 9.) + 273.15;
        } else if (other == Temperatures.CELCIUM) {
            return (temperature - 32.) * (5. / 9.);
        } else {
            return 0.0;
        }
    }
}
