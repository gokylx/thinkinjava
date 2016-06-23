package containers;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sort = new TreeSet<>();
		Collections.addAll(sort, "one two three four five six seven eight nine".split(" "));
		String head = sort.first();
		String last = sort.last();
		System.out.println("sort : " + sort);

		System.out.println("head : " + head);
		System.out.println("last : " + last);

		System.out.println(sort.headSet("four"));
		System.out.println(sort.subSet("one", "two"));
		System.out.println(sort.tailSet("six"));

	}
}
