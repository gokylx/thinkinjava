package holding;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {

	public static void main(String[] args) {
		SortedSet<Object> treeSet = new TreeSet<>();
		Random random = new Random(47);
		for (int i = 0; i < 1000; i++) {
			treeSet.add(random.nextInt());
		}
		System.out.println(treeSet);
	}

}
