// Simple demonstration  of HashMap

package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
	public static void main(String[] args) {
		Random random = new Random(47);
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < 10000; i++) {
			int key = random.nextInt(20);
			Integer value = hashMap.get(key);
			hashMap.put(key, value == null ? 1 : value + 1);
		}
		System.out.println(hashMap);
	}
}
