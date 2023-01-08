import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("Apple");
        listOfFruits.add("Orange");
        listOfFruits.add("Peer");
        listOfFruits.add("Banana");
        listOfFruits.add("Grapes");
        System.out.println("3rd fruit = "+listOfFruits.get(2)+" and last one = "+listOfFruits.get(listOfFruits.size()-1));
    }
}
