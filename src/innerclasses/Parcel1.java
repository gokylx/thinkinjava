// Createing inner class.

package innerclasses;

public class Parcel1 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		public Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}

	}

	// Using inner classes looks just like
	// using any other class, within Parcel1;

	public void ship(String dest) {
		Destination destination = new Destination(dest);
		System.out.println(destination.readLabel());
	}

	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}
}
