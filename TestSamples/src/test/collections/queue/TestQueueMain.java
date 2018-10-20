package test.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueMain {

	public static void main(String[] args) {
		testNaturalOrderQueue();
		testCustomOrderQueue();

	}

	public static void testNaturalOrderQueue() {
		// By default, elements in queue are stored in their natural order
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Zebra");
		queue.add("Elephant");
		queue.add("Cattt");
		queue.add("Dog");

		System.out.println("queue : " + queue);

		// queue.poll() picks the first item in the queue and removes it from the queue
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.poll() : " + queue.poll());
	}

	public static void testCustomOrderQueue() {
		// Custom comparator to order the elements
		Queue<String> queue = new PriorityQueue<String>(new StringLengthComparator());
		queue.add("Zebra");
		queue.add("Elephant");
		queue.add("Catttt");
		queue.add("Dog");

		System.out.println("queue : " + queue);

		// queue.poll() picks the first item in the queue and removes it from the queue
		System.out.println("queue.poll() : " + queue.poll());
		System.out.println("queue.poll() : " + queue.poll());
	}
}
