// Upcasting to a Queue from a LinkedList.
package holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queueInteger = new LinkedList<Integer>();
		Random random = new Random(47);
		for (int i = 0; i < 10; i++) {
			queueInteger.offer(random.nextInt(i + 10));
		}
		printQ(queueInteger);

		Queue<Character> linkedList = new LinkedList<Character>();
		for (Character character : "ABCDEFGHIJKLMN".toCharArray()) {
			linkedList.offer(character);
		}
		printQ(linkedList);
	}

	public static void printQ(Queue<?> queueInteger) {
		while (!queueInteger.isEmpty()) {
			System.out.print(queueInteger.remove() + " ");
		}
		System.out.println();
	}
}
