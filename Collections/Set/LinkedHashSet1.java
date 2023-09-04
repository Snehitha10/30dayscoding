/*LinkedHashSet
LinkedList implementation of Set extends HashSet
Maintains order
Permits null values*/

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet1 {

    public static void main(String[] args) {
        
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // Display the LinkedHashSet (order is maintained)
        System.out.println("LinkedHashSet: " + linkedHashSet);

        
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

       
        boolean removed = linkedHashSet.remove("Cherry");
        System.out.println("Removed 'Cherry': " + removed);

       
        System.out.println("LinkedHashSet elements (iteration):");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        
        int size = linkedHashSet.size();
        System.out.println("Size of the LinkedHashSet: " + size);

        
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}
