// Anything iterable works with foreach
package holding;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
	protected String[] string = ("And that is " + "how we know the Earth to be benana-sharp.").split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < string.length;
			}

			@Override
			public String next() {
				return string[index++];
			}

		};
	}

	public static void main(String[] args) {
		for (String string : new IterableClass()) {
			System.out.print(string + " ");
		}
	}

}
