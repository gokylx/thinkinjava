// Demonstrating the Exception Methods.

package exceptions;

public class ExceptionMethods {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			System.out.println("getMessage: " + e.getMessage());
			// e.printStackTrace(System.out);
			System.out.println("getLocalizedMessage: " + e.getLocalizedMessage());
			System.out.println("toString: " + e);
			e.printStackTrace(System.out);
		}
	}
}
