# Collections basics

Java provides a rich library to deal with a group (or collection) of objects and these helper classes are all present in the java.util package.


## List

Lists are those collections which maintain the insertion order. There are various kind of lists provided by the JDK library but the most commonly used one is ArrayList. Essentially an array list is basically a dynamic array.

Below is how we would define an arraylist containing multiple string objects:
```
    public static void main(String[] args) {
        ArrayList<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("Apple");
        listOfFruits.add("Orange");
        listOfFruits.add("Peer");
        listOfFruits.add("Banana");
        listOfFruits.add("Grapes");
        System.out.println("3rd fruit = "+listOfFruits.get(2)+" and last one = "+listOfFruits.get(listOfFruits.size()-1));
    }
```
Following are some important aspects of list in general and arraylist in particular:
- Here we have defined arraylist of strings for ease of introduction but we can have arraylist of any custom objects like arraylist of students or arraylist of vehicles etc.
- They maintain the insertion order, so we can see in the above program that Peer was the 3rd fruit to be inserted and list.get(3) fetches it.
- See the angular bracket (<>) on the right side of the arraylist instantiation - it is a shortcut meaning that this arraylist is of the type declared - string in this case.



## Set

Sets are those collections which do not maintain the insertion order but also does not allow duplicates.
Consider the folllwing example :
```
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
```

So below are some observations from running the above program:
- Size of the set is 5 as there are only 5 unique elements, duplicate copies were dropped off
- Set does not guarantee that the insertion order will be maintained 


## Map

Maps are those collections which provide the ability to store some data / value against some keys. The keys should be unique. Keys can be object but for majority of the keys, we will probably have unique strings or integer as map keys.
Consider the following example :
```
    public static void main(String[] args) {
        HashMap<Integer, String> mapOfFruits = new HashMap<>();
        mapOfFruits.put(1, "Apple");
        mapOfFruits.put(2, "Orange");
        mapOfFruits.put(3, "Grapes");
        mapOfFruits.put(4, "Banana");
        mapOfFruits.put(1, "Orange");
        System.out.println("Size of map = "+mapOfFruits.size()+", element against key 1 is : "+mapOfFruits.get(1));
    }
```    

So we can see the following from the above example:
- Size of the map is only 4 and not 5 - as number of unique keys is only 4 and not 5.
- Value against key '1' has been overridden from Apple to Orange