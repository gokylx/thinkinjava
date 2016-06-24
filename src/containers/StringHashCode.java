package containers;

public class StringHashCode {
	public static void main(String[] args) {
		String[] strings = "Hello Hello".split(" ");
		System.out.println(strings.hashCode());
		System.out.println(strings[0].hashCode());
		System.out.println(strings[1].hashCode());

	}
}
