/*
LinkedList 
implements the Collection interface.
uses a doubly linked list internally to store the elements.
allows duplicate elements.
maintains the insertion order and is not synchronized.
manipulation is fast because no shifting is required. 
*/

import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedList1 
  
{

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the end of the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Insert an element at the beginning of the list
        numbers.addFirst(5);

        // Insert an element at the end of the list
        numbers.addLast(50);

        numbers.add(3,25);
        System.out.println("LinkedList: " + numbers);

        System.out.println("Size of the LinkedList: " + numbers.size());

        // Access an element by index
        int valueAtIndex2 = numbers.get(2);
        System.out.println("Value at index 2: " + valueAtIndex2);
     
        // Remove
        numbers.remove(1);
        System.out.println("Removed element at index1: " + numbers);

        boolean removed = numbers.remove(Integer.valueOf(30));
        System.out.println("Removed 30: " + removed);

        int removedFirst = numbers.removeFirst();
        System.out.println("Removed first element: " + removedFirst);

        int removedLast = numbers.removeLast();
        System.out.println("Removed last element: " + removedLast);

        // Iterate through the LinkedList using a ListIterator
        ListIterator<Integer> iterator = numbers.listIterator();
        System.out.print("LinkedList elements (forward): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Iterate through the LinkedList in reverse order using a ListIterator
        System.out.print("LinkedList elements (reverse): ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        // Check if the LinkedList contains a specific element
        boolean contains20 = numbers.contains(20);
        System.out.println("Contains 20: " + contains20);

        // Clear all elements in the LinkedList
        numbers.clear();
        System.out.println("LinkedList after clearing: " + numbers);
    }


}

/*
Output:
LinkedList: [5, 10, 20, 25, 30, 40, 50]
Size of the LinkedList: 7
Value at index 2: 20
Removed element at index1: [5, 20, 25, 30, 40, 50]
Removed 30: true
Removed first element: 5
Removed last element: 50
LinkedList elements (forward): 20 25 40 
LinkedList elements (reverse): 40 25 20 
Contains 20: true
LinkedList after clearing: []

*/
