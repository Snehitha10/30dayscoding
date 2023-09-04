/*
SortedSet Interface
TreeSet implements SortedSet
maintains elements in a sorted order.
No Duplicates
Implemented with Red-Black Tree
*/
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

    public static void main(String[] args) {
        
        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(50);
        sortedSet.add(30);
        sortedSet.add(70);
        sortedSet.add(20);
        sortedSet.add(40);

        // Display the SortedSet (elements are in ascending order)
        System.out.println("SortedSet: " + sortedSet);

        int firstElement = sortedSet.first();
        int lastElement = sortedSet.last();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing an element from the SortedSet
        boolean removed = sortedSet.remove(30);
        System.out.println("Removed '30': " + removed);


        System.out.println("SortedSet after removal: " + sortedSet);
    }
}

