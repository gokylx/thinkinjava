package concurrency;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {

	@Override
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " : " + this);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true); // must call before start,so it can be daemon
			daemon.start();
		}
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(98);
	}
}
