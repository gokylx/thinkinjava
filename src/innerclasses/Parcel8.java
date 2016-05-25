package innerclasses;

// Calling the base-class constructor.
public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) { // Pass constructor argument.

			@Override
			public int value() {
				return super.value() * 47;
			}

		}; // semicolon required.
	}

	public static void main(String[] args) {
		Parcel8 parcel8 = new Parcel8();
		Wrapping wrapping = parcel8.wrapping(10);
		System.out.println(wrapping.value());

	}
}
