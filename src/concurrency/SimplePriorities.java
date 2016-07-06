package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Shows the use of thread priorities.
public class SimplePriorities implements Runnable {
	private int countDown = 5;
	@SuppressWarnings("unused")
	private volatile double d; // No optimization
	private int priority;

	public SimplePriorities(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return Thread.currentThread() + ": " + countDown;
	}

	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		while (true) {
//			An expensive, interruptable operation:
			for (int i = 1; i < 10000000; i++) {
				d += (Math.PI + Math.E) / i;
//				System.out.println(d);
				if ((i % 1000000) == 0) {
					Thread.yield();
				}
			}
			System.out.println(this);
			if (--countDown == 0) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		}
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.shutdown();
	}

}
