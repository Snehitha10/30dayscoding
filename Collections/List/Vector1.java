/*Vector:
implements List interface
uses a dynamic array to store the data elements
similar to ArrayList.
synchronized and 
contains many methods that are not the part of Collection framework. */


import java.util.Collections;
import java.util.Vector;

public class Vector1 {
    public static void main(String args[]){
        Vector<String> vector=new Vector<>();
      
        vector.add("A");
        vector.add("AB");
        vector.add("ABC");
        vector.add("ABCD");
        System.out.println("vector elements: "+vector);
      
        vector.add(3,"ABCDE");
        System.out.println("Element at index 3: "+vector.get(3));

        System.out.println("size of the vector: "+vector.size());
      
        System.out.println("remove ABC: "+vector.remove("ABC"));
        System.out.println("remove value at index 0: "+vector.remove(0));

        System.out.println("check if vector is empty: "+vector.isEmpty());

        vector.add("ABCDEF");
        vector.add("ABCDEF");
        System.out.println("vector elements: "+vector);

        System.out.println("sub vector: " + vector.subList(0,3));

    }
}
