

/**
 * A class implementing a Priority Queue using single linked chain
 */

public class LinkedPriorityQueue<T> implements PriorityQueueInterface<T> {
	// member variables
	private Node frontNode;
	private Node backNode;

	public LinkedPriorityQueue() {
		frontNode = null;
		backNode = null;
	}

	/** Adds a new entry to this priority queue.
	 @param newEntry  An object to be added. */
	public void add(T newEntry) {
		
	}

	/** Removes and returns the entry having the highest priority.
	 @return  Either the object having the highest priority or,
	 if the priority queue is empty before the operation, null. */
	public T remove() {

	}

	/** Retrieves the entry having the highest priority.
	 @return  Either the object having the highest priority or,
	 if the priority queue is empty, null. */
	public T peek() {

	}

	/** Detects whether this priority queue is empty.
	 @return  True if the priority queue is empty, or false otherwise. */
	public boolean isEmpty() {

	}

	/** Gets the size of this priority queue.
	 @return  The number of entries currently in the priority queue. */
	public int getSize() {

	}

	/** Removes all entries from this priority queue. */
	public void clear() {

	}

	/** Implements Node class */
	private class Node {
		private T data;
		private Node next;

		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		private void setData(T newData) {
			data = newData;
		}

		public Node getNextNode() {
			return next;
		}

		private void setNextNode(Node newNode) {
			next = newNode;
		}

	}

}
