import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> setOfFruits = new HashSet<>();
        setOfFruits.add("Apple");
        setOfFruits.add("Apple");
        setOfFruits.add("Orange");
        setOfFruits.add("Banana");
        setOfFruits.add("Peer");
        setOfFruits.add("Grapes");
        setOfFruits.add("Orange");
        System.out.println("Total size = "+setOfFruits.size());
    }
}
