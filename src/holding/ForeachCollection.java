// All collections work with foreach
package holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForeachCollection {
	public static void main(String[] args) {
		Collection<String> list = new LinkedList<String>();
		Collections.addAll(list, "long long a way to travel".split(" "));

		for (String string : list) {
			System.out.print(" '" + string + "' ");
		}
	}
}
