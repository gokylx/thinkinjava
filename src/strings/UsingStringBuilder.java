package strings;

import java.util.Random;

public class UsingStringBuilder {
	public static Random rand = new Random(47);

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("[");
		for (int i = 1; i < 10; i++) {
			stringBuilder.append(rand.nextInt(100));
			stringBuilder.append(", ");
		}

		// stringBuilder.delete(stringBuilder.length() - 2,
		// stringBuilder.length());

		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);

		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	public static void main(String[] args) {

		UsingStringBuilder usingStringBuilder = new UsingStringBuilder();
		System.out.println(usingStringBuilder);

	}

}
