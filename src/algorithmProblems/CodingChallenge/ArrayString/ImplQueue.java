package algorithmProblems.CodingChallenge.ArrayString;

import java.util.LinkedList;
import java.util.Queue;

public class ImplQueue {

    public static void implQueue() {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // Display the queue
        System.out.println("Queue: " + queue);

        // Dequeue an element
        int dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);

        // Peek at the front element
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Queue size: " + size);
    }

    public static void main(String[] args) {
        implQueue();
    }
}
