package laba_6_exc_11;

public class Celcium implements Convertable {

    private double temperature;

    public Celcium(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public double convert(Temperatures other) {
        if (other == Temperatures.FARENGHEIT) {
            return (temperature * (9. / 5.)) + 32.;
        } else if (other == Temperatures.KELVIN) {
            return temperature + 273.15;
        } else if (other == Temperatures.CELCIUM) {
            return temperature;
        } else {
            return 0.0;
        }
    }
}
