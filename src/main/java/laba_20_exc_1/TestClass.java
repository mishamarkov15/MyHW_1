package laba_20_exc_1;

public class TestClass<T, V, K> {
    private T t;
    private V v;
    private K k;

    public TestClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void showDataTypesName() {
        System.out.printf("T = %s\nV = %s\nK = %s", t.getClass(), v.getClass(), k.getClass());
    }
}
