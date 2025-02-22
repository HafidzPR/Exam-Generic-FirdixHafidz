package util;

import java.util.List;

// 4. Wildcard
public class NumberUtils {
    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
