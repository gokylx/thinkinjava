package holding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Random random = new Random(47);
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(random.nextInt(i + 10));
		}

		QueueDemo.printQ(priorityQueue);

		List<Integer> asList = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<Integer>(asList);
		QueueDemo.printQ(priorityQueue);

		priorityQueue = new PriorityQueue<>(asList.size(), Collections.reverseOrder());
		priorityQueue.addAll(asList);
		QueueDemo.printQ(priorityQueue);
		System.out.println("aaa");

		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION.";
		List<String> asList2 = Arrays.asList(fact.split(""));
		PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(asList2);
		// priorityQueue2.addAll(asList2);
		QueueDemo.printQ(priorityQueue2);

		Set<Character> hashSet = new HashSet<Character>();
		for (Character character : fact.toCharArray()) {
			hashSet.add(character);

		}
		PriorityQueue<Character> priorityQueue3 = new PriorityQueue<Character>(hashSet);
		// System.out.println(hashSet);
		QueueDemo.printQ(priorityQueue3);
	}
}
