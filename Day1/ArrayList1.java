/* ArrayList  
implements the List interface.
uses a dynamic array to store the duplicate element of different data types.
maintains the insertion order and is non-synchronized.
elements stored in the ArrayList class can be randomly accessed. 
Methods: add(obj),add(index,obj),remove(index),size(),clear etc.
  */
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1{
    public static void main(String args[]){
        List<String> al=new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("D");
        System.out.println("before adding c:  "+al);
        al.add(2,"C");
        System.out.println("after adding c at index 2:  "+ al);
        al.remove(0);
        System.out.println("after removing element at 0th index:  "+al);
        Iterator iter=al.iterator();
        System.out.print("retrieving elements using iterator: ");
        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
        System.out.println(" ");

        
        al.add(0,"E");
        
         // Iterating through the ArrayList using a for-each loop
         System.out.print("iterated using for-each loop: ");
         for (String element : al) {
             System.out.print(element + " ");
         }
         
         System.out.println(" ");
         boolean containsb= al.contains("B");
         System.out.println("B is in al: "+containsb);
        
        Collections.sort(al);
        System.out.println("after sorting:"+al);


        int size = al.size();
        System.out.println("Size of the ArrayList: " + size);

        al.clear();
        
        System.out.println("After clearing the ArrayList: " + al);

    }
}
