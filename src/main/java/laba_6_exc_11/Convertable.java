package laba_6_exc_11;

enum Temperatures {
    CELCIUM,
    FARENGHEIT,
    KELVIN
}

public interface Convertable {
    public double convert(Temperatures other);
}
