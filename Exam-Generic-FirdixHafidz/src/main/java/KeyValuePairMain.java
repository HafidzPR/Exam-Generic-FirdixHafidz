import util.KeyValuePair;

public class KeyValuePairMain {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> agePair = new KeyValuePair<>("Hafidz el Firdi", 22);
        KeyValuePair<Integer, String> idPair = new KeyValuePair<>(2025, "Universitas Diponegoro");

        System.out.println("Name    :   " + agePair.getKey() + "     | Age    : " + agePair.getValue());
        System.out.println("ID      :   " + idPair.getKey() + "                | Status : " + idPair.getValue());
    }
}
