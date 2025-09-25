# Java-Collections-Framework-Comparison
```java
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

```
---

# 📚 CollectionsComparison – Java Collections Demo

This program demonstrates the **core differences between `List`, `Set`, and `Map`** in Java using their common implementations:  

- **`ArrayList`** (ordered, allows duplicates)  
- **`HashSet`** (unique elements, no guaranteed order)  
- **`HashMap`** (key–value pairs, unique keys)  

It’s designed as a learning tool to help you understand how these data structures behave in practice.

---

## 🚀 Features Demonstrated

### 1. **List (ArrayList)**
- Ordered collection, elements can be accessed by index.  
- Allows duplicate values.  
- Example: A fruit list with `"Apple"` appearing twice.  

```java
List<String> fruitsList = new ArrayList<>();
fruitsList.add("Apple");
fruitsList.add("Banana");
fruitsList.add("Apple"); // duplicate
fruitsList.add("Cherry");
```

**Output Example:**  
```
The List is: [Apple, Banana, Apple, Cherry]
Size of the List: 4
Element at index 1: Banana
```

---

### 2. **Set (HashSet)**
- Stores only **unique elements**.  
- Ignores duplicates automatically.  
- Does **not guarantee order** (in case of `HashSet`).  

```java
Set<String> fruitsSet = new HashSet<>();
fruitsSet.add("Apple");
fruitsSet.add("Banana");
fruitsSet.add("Apple"); // ignored
fruitsSet.add("Cherry");
```

**Output Example:**  
```
The Set is: [Banana, Cherry, Apple]
Size of the Set: 3
Contains 'Banana'? true
```

---

### 3. **Map (HashMap)**
- Stores **key–value pairs**.  
- Keys must be unique; values can be duplicated.  
- Inserting a duplicate key **overwrites** the old value.  

```java
Map<String, Integer> studentScores = new HashMap<>();
studentScores.put("Alice", 95);
studentScores.put("Bob", 88);
studentScores.put("Charlie", 95);
studentScores.put("Alice", 100); // overwrites old value
```

**Output Example:**  
```
The Map is: {Bob=88, Alice=100, Charlie=95}
Size of the Map: 3
Bob's score is: 88
Alice's new score is: 100
```

---

## 📊 Summary Table

| Collection | Allows Duplicates? | Maintains Order?       | Access Method   |
|------------|--------------------|------------------------|-----------------|
| **List**   | ✅ Yes             | ✅ Yes (insertion order) | By Index        |
| **Set**    | ❌ No              | ❌ No (for HashSet)     | By Value        |
| **Map**    | ❌ No (keys only)  | ❌ No (for HashMap)     | By Unique Key   |

---

## 🎯 Learning Outcomes
- Understand the **differences between List, Set, and Map**.  
- See how **duplicates and ordering** are handled.  
- Learn how to **access elements** (by index, by value, or by key).  
- Build intuition for choosing the **right collection** in real-world applications.  

---

👉 This program is perfect for beginners exploring the **Java Collections Framework** and for quick revision before interviews or exams.  

---
