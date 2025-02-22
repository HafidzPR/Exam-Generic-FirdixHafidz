package util;

// 3. Bounded Type Parameter
public class MathOps<T extends Number> {
    private T number;

    public MathOps(T number) {
        this.number = number;
    }

    public double square() {
        return number.doubleValue() * number.doubleValue();
    }
}
