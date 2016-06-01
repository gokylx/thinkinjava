// Anything iterable works with foreach
package holding;

import java.util.Iterator;

public class IterableClass {
	protected String[] string = ("And that is " + "how we know the Earth to be benana-sharp.").split(" ");

	public Iterator<String> iterable() {
		return new Iterator() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < string.length;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
