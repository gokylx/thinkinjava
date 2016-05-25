package innerclasses;

class Parcel4 {
	private class pContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}

	}

	protected class pDestination implements Destination {
		private String label;

		protected pDestination(String label) {

			this.label = label;
		}

		@Override
		public String readLabel() {
			return label;
		}

	}

	public Destination destiantion(String s) {
		return new pDestination(s);
	}

	public Contents contents() {
		return new pContents();
	}

}

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destiantion = parcel4.destiantion("Tasmania");
		System.out.println(contents.toString());
		System.out.println(destiantion.toString());
	}
}
