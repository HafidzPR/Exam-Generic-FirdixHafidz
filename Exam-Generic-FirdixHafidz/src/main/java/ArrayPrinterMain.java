import util.ArrayPrinter;

public class ArrayPrinterMain {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Wildcard"};

        System.out.println("===========================================");
        ArrayPrinter.printArray(intArray);
        ArrayPrinter.printArray(strArray);
        System.out.println("===========================================");
    }
}
