public class LinkedPriorityQueueTest {
	
	public static void main(String[] args) { // rename to 'main' and run
		LinkedPriorityQueue queue = new LinkedPriorityQueue();
		
		String person1 = "person1";
		String person2 = "person2";
		String person3 = "person3";
		String person4 = "person4";
		
		queue.add(person1);
		queue.add(person2);
		queue.add(person3);
		queue.add(person4);
		
		System.out.println(queue.peek()); // person1
		
		System.out.println(queue.remove()); // person1
		
		System.out.println(queue.peek()); // person2
		
		System.out.println(queue.isEmpty()); // false
		
		queue.clear();
		
		System.out.println(queue.isEmpty()); // true
		
		queue.add(person4);
		
		System.out.println(queue.peek()); // person4
		
	}
	
}
