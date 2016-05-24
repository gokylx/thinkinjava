package innerclasses;
// Using "instance initialization" to perform
// constructor on an inner class.
public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			// Instance initialization for each object.
			{
				cost = Math.round(price);
				if (cost > 100) {
					System.out.println("Over budget!");
				}
			}
//			private String label = dest;
			@Override
			public String readLabel() {
//				return label;
				return dest;
			}
		};
	}
	public static void main(String[] args) {
		Parcel10 parcel10 = new Parcel10();
		Destination destination = parcel10.destination("Tasmania", 101.395F);
		destination.readLabel();
		
	}

}
