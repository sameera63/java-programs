import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
      public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();
	        queue.add(10);
	        queue.add(20);
	        queue.add(30);
            System.out.println("Queue after enqueue operations: " + queue);
	        System.out.println("Front element: " + queue.peek());
            int removedElement = queue.remove();
	        System.out.println("Removed element: " + removedElement);
            System.out.println("Queue after dequeue operation: " + queue);
	        System.out.println("Is the queue empty? " + queue.isEmpty());
	    }
	}