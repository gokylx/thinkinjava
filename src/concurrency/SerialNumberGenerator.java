package concurrency;

public class SerialNumberGenerator {
	private static volatile int serialNumber = 0;

	public static int nexSerialNumber() {
		return serialNumber++; // Not thread-safe
	}
}
