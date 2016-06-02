// This produce a specific application of
// the control system. all in a single class.
// Inner classes allow you to encapsulate different
// functionality for each type of event.

package innerclasses.controller;

public class GreenhourseControls extends Controller {
	public class LightOn extends Event {
		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
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
		}

		@Override
		public String toString() {
			return "liht is off.";
		}
	}

	public class WaterOn extends Event {
		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
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
		}

		@Override
		public String toString() {
			return "Greenhouse water is off";
		}
	}

	public class ThemostatDay extends Event {
		public ThemostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
		}

		@Override
		public String toString() {
			return "Thermostat on day setting.";
		}

	}

	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
		}

		@Override
		public String toString() {
			return "Thermostat on night setting.";
		}
	}

	// an example of action() that insert a new one of itself into the event
	// list.
	public class Bell extends Event {
		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}

		@Override
		public String toString() {
			return "Bing!";
		}

	}

	public class Restart extends Event {

		private Event[] eventList;

		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event event : eventList) {
				addEvent(event);
			}
		}

		@Override
		public void action() {
			for (Event event : eventList) {
				event.start();
				addEvent(event);
			}
			start();
			addEvent(this);
		}

		@Override
		public String toString() {
			return "Restarting the system...";
		}

	}

	public static class Terminate extends Event {
		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			System.exit(0);
		}

		@Override
		public String toString() {
			return "System terminating...";
		}
	}
}
