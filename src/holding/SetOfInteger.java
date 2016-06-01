package holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

	public static void main(String[] args) {
		Random random = new Random(47);
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 1000; i++) {
			set.add(random.nextInt());
		}

		System.out.println(set);
	}

}
