import util.Box;

public class BoxMain {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        System.out.println("===========================================");
        stringBox.setItem("Hello, Generics!");
        System.out.println("String Box  :   " + stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(100);
        System.out.println("Integer Box :   " + intBox.getItem());
        System.out.println("===========================================");
    }
}
