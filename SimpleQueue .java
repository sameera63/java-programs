public class SimpleQueue {
	    private int[] queue;
	    private int front, rear, size, capacity;
	    public SimpleQueue(int capacity) {
	        this.capacity = capacity;
	        queue = new int[capacity];
	        front = 0;
	        size = 0;
	        rear = -1;
	    }
	    public void enqueue(int item) {
	        if (size == capacity) {
	            System.out.println("Queue is full, cannot enqueue " + item);
	            return;
	        }
	        rear = (rear + 1) % capacity; 
	        queue[rear] = item;
	        size++;
	        System.out.println("Enqueued: " + item);
	    }
          public int dequeue() {
	        if (size == 0) {
	            System.out.println("Queue is empty, cannot dequeue.");
	        }
	        int item = queue[front];
	        front = (front + 1) % capacity; 
	        size--;
	        System.out.println("Dequeued: " + item);
	        return item;
	    }
	    public boolean isEmpty() {
	        return size == 0;
	    }
	    public boolean isFull() {
	        return size == capacity;
	    }

	    public static void main(String[] args) {
	        SimpleQueue q = new SimpleQueue(5);
            q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);
            q.dequeue();
	        q.dequeue();
            q.enqueue(40);
	        q.enqueue(50);
	        q.enqueue(60);
	        q.enqueue(70); 
            while (!q.isEmpty()) {
	            q.dequeue();
	        }
	    }
	}



