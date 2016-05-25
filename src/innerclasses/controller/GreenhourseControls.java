// This produce a specific application of  
// the control system. all in a single class.
// Inner classes allow you to encapsulate different 
// functionality for each type of event.

package innerclasses.controller;

public class GreenhourseControls extends Controller {
	private boolean light = false;

	public class LightOn extends Event {
		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// put hardware control code here to physically turn on the light.
			light = true;
		}

		@Override
		public String toString() {
			return "light is on.";
		}

	}

	public class LightOff extends Event {
		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// put hardware control code to here to physically turn off the
			// light.
			light = false;
		}

		@Override
		public String toString() {
			return "liht is off.";
		}
	}

	private boolean water = false;

	public class WaterOn extends Event {
		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// put hardware control code to here
			water = true;
		}

		@Override
		public String toString() {
			return "Greenhouse water is on";
		}
	}

	public class WaterOff extends Event {
		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// put hardware control code to here
			water = false;
		}

		@Override
		public String toString() {
			return "Greenhouse water is off";
		}
	}

}
