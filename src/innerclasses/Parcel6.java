package innerclasses;
// Nesting a class within a scope.

public class Parcel6 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;

				public TrackingSlip(String id) {
					this.id = id;
				}

				String getSlip() {
					return id;
				}
			}

			TrackingSlip trackingSlip = new TrackingSlip("slip");
			String slip = trackingSlip.getSlip();
			System.out.println(slip.length());

		}
		// can't use it here! Out of scope:
		// ! TrackingSlip trackingSlip = new TrackingSlip("x");
	}

	public void track() {
		internalTracking(true);
	}

	public static void main(String[] args) {
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}
}
