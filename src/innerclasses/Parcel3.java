package innerclasses;

// Using .new to create instance of inner classes.
public class Parcel3 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}

	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			whereTo = label;
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		Parcel3 parcel3 = new Parcel3();
		Contents contents = parcel3.new Contents();
		Destination destination = parcel3.new Destination("Tasmania");
		System.out.println(contents.i);
		System.out.println(destination.label);
	}

}
