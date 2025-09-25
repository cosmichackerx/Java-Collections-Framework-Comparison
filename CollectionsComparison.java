import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This program demonstrates the core differences between List, Set, and Map
 * using common implementations like ArrayList, HashSet, and HashMap.
 */
public class CollectionsComparison {

    public static void main(String[] args) {

        System.out.println("--- 1. List: Ordered, Allows Duplicates ---");
        System.out.println("A List is an ordered collection where you can access elements by their index.");
        System.out.println("It allows for duplicate elements.");

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Apple"); // Adding a duplicate
        fruitsList.add("Cherry");

        System.out.println("The List is: " + fruitsList);
        System.out.println("Size of the List: " + fruitsList.size()); // Size is 4
        System.out.println("Element at index 1: " + fruitsList.get(1)); // Access by index
        System.out.println();


        System.out.println("--- 2. Set: Unique Elements, No Guaranteed Order ---");
        System.out.println("A Set is a collection that cannot contain duplicate elements.");
        System.out.println("For a HashSet, the order of elements is not guaranteed.");

        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Apple"); // This duplicate will be ignored
        fruitsSet.add("Cherry");

        System.out.println("The Set is: " + fruitsSet);
        System.out.println("Size of the Set: " + fruitsSet.size()); // Size is 3 (Apple is unique)
        System.out.println("Contains 'Banana'? " + fruitsSet.contains("Banana"));
        System.out.println();


        System.out.println("--- 3. Map: Key-Value Pairs, Unique Keys ---");
        System.out.println("A Map is a collection of key-value pairs.");
        System.out.println("Each key must be unique, and it maps to a value.");

        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 95); // Different key, same value
        studentScores.put("Alice", 100); // The value for key "Alice" is overwritten

        System.out.println("The Map is: " + studentScores);
        System.out.println("Size of the Map: " + studentScores.size()); // Size is 3 (Alice's old score was overwritten)
        System.out.println("Bob's score is: " + studentScores.get("Bob")); // Get value by key
        System.out.println("Alice's new score is: " + studentScores.get("Alice"));
        System.out.println();

        System.out.println("--- Summary Table ---");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| Collection | Allows Duplicates? | Maintains Order? | Access Method |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| List       | Yes                | Yes (by insertion) | By Index      |");
        System.out.println("| Set        | No                 | No (for HashSet)  | By Value      |");
        System.out.println("| Map        | No (keys only)     | No (for HashMap)  | By Unique Key |");
        System.out.println("------------------------------------------------------------------");
    }
}
