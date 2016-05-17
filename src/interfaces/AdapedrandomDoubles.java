// Creating an adapter with inheritance.
package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapedrandomDoubles extends RandomDoubles implements Readable {
	private int count;

	public AdapedrandomDoubles(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		String string = Double.toString(next()) + " ";
		cb.append(string);

		return string.length();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new AdapedrandomDoubles(7));
		while (scanner.hasNext()) {
			System.out.println(scanner.nextDouble() + " ");
		}
		scanner.close();
	}
}
