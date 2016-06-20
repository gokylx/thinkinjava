package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress {
	String string;

	public StringAddress(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return super.toString() + " " + string + "\n";
	}
}

public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);

		System.out.println();

		Collections.fill(list, new StringAddress("world"));
		System.out.println(list);
	}
}
