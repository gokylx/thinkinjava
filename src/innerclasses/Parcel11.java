package innerclasses;
// Nesting classes(static inner classes)

public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}

	}

	protected static class ParcelDestination implements Destination {
		private String label;

		public ParcelDestination(String label) {

			this.label = label;
		}

		@Override
		public String readLabel() {
			return label;
		}

		// Nested class can contain other static elements;
		public static void f() {
		};

		static int x = 10;

		static class AnotherLevel {
			public static void f() {
			};

			static int x = 10;
		}
	}

	public static Destination destination(String label) {
		return new ParcelDestination(label);
	}

	public static Contents contents() {
		return new ParcelContents();
	}

	public static void main(String[] args) {
		Destination destination = destination("Tasmania");
		Contents contents = contents();

		String readLabel = destination.readLabel();
		System.out.println(readLabel);
		int value = contents.value();
		System.out.println(value);

	}

}
