package innerclasses;

// Expanded vision of Parcel7.java
public class Parcel7b {
	public class MyContents implements Contents {
		private int i = 12;

		@Override
		public int value() {
			return i;
		}

	}
	public Contents contents() {
		return new MyContents();
	}
	public static void main(String[] args) {
		Parcel7b parcel7b = new Parcel7b();
		Contents contents = parcel7b.contents();
		System.out.println(contents.value());
	}
}
