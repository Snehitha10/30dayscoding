/*Key-Value Pairs
Unordered
No Duplicates:
  Keys in a HashMap must be unique
  but duplicate values are allowed.
Null Values: Both keys and values can be null.
Efficient Retrieval: Retrieving a value based on its key in a HashMap is very efficient, typically with constant-time complexity (O(1)), on average.
The HashMap uses hashing to store and retrieve elements */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1{

    public static void main(String[] args) {
       
        Map<Integer, String> hashMap = new HashMap<>();

        
        hashMap.put(1, "Alice");
        hashMap.put(2, "Bob");
        hashMap.put(3, "Charlie");
        hashMap.put(4, "David");

        // Accessing values by keys
        String name1 = hashMap.get(2);
        System.out.println("Value for key 2: " + name1);

        // Check if a key exists
        boolean keyExists = hashMap.containsKey(3);
        System.out.println("Key 3 exists: " + keyExists);

        // Check if a value exists
        boolean valueExists = hashMap.containsValue("Eve");
        System.out.println("Value 'Eve' exists: " + valueExists);

        // Remove a key-value pair
        String removedValue = hashMap.remove(1);
        System.out.println("Removed value: " + removedValue);

        // Iterate through the keys and values
        Set<Integer> keys = hashMap.keySet();

        System.out.println("Keys:");
        for (Integer key : keys) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("HashMap is empty: " + isEmpty);

        
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        System.out.println("HashMap Entries:");
        for (Map.Entry<Integer, String> entry : entrySet) {
            // Access key and value for each entry
            Integer key = entry.getKey();
            String value = entry.getValue();

            // Display the key-value pair
            System.out.println("Key: " + key + ", Value: " + value);

        
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
}
