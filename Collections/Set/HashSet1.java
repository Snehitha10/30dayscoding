/*
 * 1.HashSet
Implements Set interface
Uses hash table for storage
Contains unique elements
*/
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1{

    public static void main(String[] args) {
       
        HashSet<String> set = new HashSet<>();

       
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

      
        System.out.println("HashSet: " + set);
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);
       
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana'? " + containsBanana);

        // Remove an element from the HashSet
        boolean removed = set.remove("Cherry");
        System.out.println("Removed 'Cherry': " + removed);

     
        System.out.println("HashSet elements (iteration):");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
        
            System.out.print( iterator.next()+" ");
        }
        System.out.println();
       
       

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
