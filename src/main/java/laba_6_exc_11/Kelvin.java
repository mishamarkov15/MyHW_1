package laba_6_exc_11;

public class Kelvin implements Convertable {
    private double temperature;

    public Kelvin(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public double convert(Temperatures other) {
        if (other == Temperatures.FARENGHEIT) {
            return (temperature - 273.15) * (9. / 5.) + 32.;
        } else if (other == Temperatures.KELVIN) {
            return temperature;
        } else if (other == Temperatures.CELCIUM) {
            return temperature - 273.15;
        } else {
            return 0.0;
        }
    }
}
