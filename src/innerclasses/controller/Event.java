// The common method for any control event.
package innerclasses.controller;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;

	public Event(long delayTime) {

		this.delayTime = delayTime;
		star();
	}

	public void star() {
		eventTime = System.nanoTime() + delayTime;
	}

	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}

	public abstract void action();

}
