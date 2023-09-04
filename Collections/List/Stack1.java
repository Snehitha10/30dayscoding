/*The stack is the subclass of Vector.
implements the last-in-first-out data structure, i.e., Stack.
stack contains all of the methods of Vector class 
provides its methods like boolean push(), boolean peek(), 
boolean push(object o), which defines its properties. */
import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        
        System.out.println("Stack: " + stack);

        
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

       
        int size = stack.size();
        System.out.println("Size of the stack: " + size);

        // Peek : the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Pop :removes and returns the top element
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

       
        System.out.println("Stack after popping: " + stack);

       
        int position = stack.search("Banana");
        System.out.println("Position of 'Banana' in the stack: " + position);

        // Clear all elements from the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}

