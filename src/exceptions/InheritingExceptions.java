// Creating own exceptions.
package exceptions;

class SimpleException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

}

public class InheritingExceptions {
	public void f() throws SimpleException {
		System.out.println("Throwing SimpleException form f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		InheritingExceptions exceptions = new InheritingExceptions();
		try {
			exceptions.f();
		} catch (SimpleException e) {

			// e.printStackTrace();
			System.out.println("got it.");
		}
	}
}
