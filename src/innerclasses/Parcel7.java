package innerclasses;
// Returning an instance of anonymous inner class.

public class Parcel7 {
	public Contents contents() { // Insert a class definition
		return new Contents() {
			private int i = 11;

			@Override
			public int value() {
				return i;
			}
		}; // semicolon required in this case
	}

	public static void main(String[] args) {
		Parcel7 parcel7 = new Parcel7();
		Contents contents = parcel7.contents();
		int value = contents.value();
		System.out.println(value);
	}
}
