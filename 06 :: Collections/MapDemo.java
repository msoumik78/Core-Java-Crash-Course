import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> mapOfFruits = new HashMap<>();
        mapOfFruits.put(1, "Apple");
        mapOfFruits.put(2, "Orange");
        mapOfFruits.put(3, "Grapes");
        mapOfFruits.put(4, "Banana");
        mapOfFruits.put(1, "Orange");
        System.out.println("Size of map = "+mapOfFruits.size()+", element against key 1 is : "+mapOfFruits.get(1));
    }
}
