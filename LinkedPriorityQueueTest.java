import java.util.PriorityQueue;

public class LinkedPriorityQueueTest {
	
	public static void main(String[] args) { // rename to 'main' and run
		LinkedPriorityQueue priorityQueue = new LinkedPriorityQueue();
		
		String high = "1";
		String med = "2";
		String low = "3";
		
		int one = 1;
		int two = 2;
		int three = 3;
		
		priorityQueue.add(one);
		priorityQueue.add(two);
		priorityQueue.add(three);
		priorityQueue.add(two);
		
		System.out.println("Size " + priorityQueue.getSize()); // size 4
		
		System.out.println(priorityQueue.peek()); // 1
		
		System.out.println(priorityQueue.remove()); // 1
		
		System.out.println("Size " + priorityQueue.getSize()); // size 3
		
		System.out.println(priorityQueue.peek()); // 2
		
		System.out.println(priorityQueue.isEmpty()); // false
		
		priorityQueue.clear();
		
		System.out.println("Size " + priorityQueue.getSize()); // size 0
		
		System.out.println(priorityQueue.isEmpty()); // true
		
		priorityQueue.add(three);
		
		System.out.println(priorityQueue.peek()); // 3
		
		System.out.println("Size " + priorityQueue.getSize()); // size 1
		
		priorityQueue.clear();
		
		priorityQueue.add(two);
		priorityQueue.add(one);
		priorityQueue.add(three);
		priorityQueue.add(two);
		
		System.out.println(priorityQueue.remove()); // 1
		
		System.out.println(priorityQueue.remove()); // 2
		
		System.out.println(priorityQueue.remove()); // 2
		
		System.out.println(priorityQueue.remove()); // 3
		
		System.out.println(priorityQueue.remove()); // null
		
	}
	
}
