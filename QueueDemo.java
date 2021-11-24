package Stack_Queues;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		MyQueue newQueue = new MyQueue();
		newQueue.enqueue(56);
		newQueue.enqueue(30);
		newQueue.enqueue(70);
		newQueue.display();
		
		System.out.println();
		
		newQueue.dequeue();
		newQueue.display();
	}
	
	
	
}
