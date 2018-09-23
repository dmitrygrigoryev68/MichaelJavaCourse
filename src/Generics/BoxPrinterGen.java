package Generics;

public class BoxPrinterGen<T> {
    private T val;

    public BoxPrinterGen(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}