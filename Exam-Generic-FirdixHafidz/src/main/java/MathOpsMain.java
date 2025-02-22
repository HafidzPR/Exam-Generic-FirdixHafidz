import util.MathOps;

public class MathOpsMain {
    public static void main(String[] args) {
        System.out.println("===========================================");
        MathOps<Integer> intOp = new MathOps<>(5);
        System.out.println("Square of 5     :   " + intOp.square());

        MathOps<Double> doubleOp = new MathOps<>(4.5);
        System.out.println("Square of 4.5   :   " + doubleOp.square());
        System.out.println("===========================================");
    }
}
