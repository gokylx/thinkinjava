package innerclasses;

// an anonymous inner class that performs
// initialization. A briefer vision of Parcel5.java..
public class Parcel9 {
	// Argument must be final to use inside anonymous inner class.
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;

			@Override
			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 parcel9 = new Parcel9();
		Destination destination = parcel9.destination("Tasmania");
		System.out.println(destination.readLabel());
	}
}
