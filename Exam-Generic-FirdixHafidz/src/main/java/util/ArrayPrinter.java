package util;

import java.util.Arrays;

// 2. Generic Method
public class ArrayPrinter {
    public static <T> void printArray(T[] array) {
        System.out.println("Array Elements  :    " + Arrays.toString(array));
    }
}
