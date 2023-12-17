package laba_20_exc_4;

public class MinMax<T extends Comparable> {
    private T _data[];

    public MinMax(T[] data1) {
        _data = data1;
    }

    public T getMin() {
        T min = _data[0];
        for (int i = 1; i < _data.length; ++i) {
            if (_data[i].compareTo(min) < 0) {min = _data[i];}
        }
        return min;
    }

    public T getMax() {
        T max = _data[0];
        for (int i = 1; i < _data.length; ++i) {
            if (_data[i].compareTo(max) > 0) {max = _data[i];}
        }
        return max;
    }
}
