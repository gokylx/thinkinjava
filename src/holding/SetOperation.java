package holding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Collections.addAll(set1, "A B C D E F G H".split(" "));
		set1.add("M");
		System.out.println("set1: " + set1);
		System.out.println("M : " + set1.contains("M"));
		System.out.println("N : " + set1.contains("N"));

	}
}
