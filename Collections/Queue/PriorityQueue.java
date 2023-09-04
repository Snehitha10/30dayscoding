/*
Implements Queue Interface
Priority-Based Ordering
Lowest priority element is removed first.
No Fixed Order
Not Thread-Safe: Not inherently thread-safe.
Doesn't allow duplicate elements.
No Index-Based Access
Used in algorithms like Dijkstra's.

*/

import java.util.PriorityQueue;

public class PriorityQueue1{

    public static void main(String[] args) {
        
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(40);

    
        System.out.println("PriorityQueue: " + priorityQueue);

        // Peek: the element with the highest priority (without removal)
        int highestPriority = priorityQueue.peek();
        System.out.println("Highest Priority Element (peek): " + highestPriority);

        // Remove and retrieve elements in priority order
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.poll();
            System.out.println("Removed Element: " + element);
        }

        
        System.out.println("PriorityQueue is empty: " + priorityQueue.isEmpty());
    }
}

