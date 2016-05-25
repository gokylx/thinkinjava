// Returning a reference to an inner class.

package innerclasses;

public class Parcel2 {
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

	public Contents contents() {
		return new Contents();
	}

	public void ship(String dest) {
		Destination destination = new Destination(dest);
		System.out.println(destination.readLabel());
	}

	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
	}
}
