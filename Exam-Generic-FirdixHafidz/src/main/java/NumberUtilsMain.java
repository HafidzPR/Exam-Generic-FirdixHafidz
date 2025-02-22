import util.NumberUtils;

import java.util.Arrays;
import java.util.List;

public class NumberUtilsMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("===========================================");
        System.out.println("Sum of Integers     :   " + NumberUtils.sumNumbers(intList));
        System.out.println("Sum of Doubles      :   " + NumberUtils.sumNumbers(doubleList));
        System.out.println("===========================================");
    }
}
