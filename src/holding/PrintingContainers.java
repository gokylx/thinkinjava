// Containers print themselves automatically.

package holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintingContainers {
	static Collection<String> fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");

		return collection;
	}

	static Map<String, String> fill(Map<String, String> map) {
		map.put("rat", "Fruuzy");
		map.put("cat", "Tom");
		map.put("dog", "Judy");
		map.put("dog", "Spot");

		return map;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList : " + fill(new ArrayList<>()));
		System.out.println("LinkedList : " + fill(new LinkedList<>()));
		System.out.println("HashSet : " + fill(new HashSet<>()));
		System.out.println("TreeSet : " + fill(new TreeSet<>()));
		System.out.println("LinkedHashSet: " + fill(new LinkedHashSet<>()));
		System.out.println("HashMap : " + fill(new HashMap<String, String>()));
		System.out.println("TreeMap : " + fill(new TreeMap<String, String>()));
		System.err.println("LinkedHashMap : " + fill(new LinkedHashMap<String, String>()));
	}
}
