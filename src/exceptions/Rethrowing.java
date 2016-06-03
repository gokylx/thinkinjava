// Demonstrating fillInStackTrace
package exceptions;

public class Rethrowing {
	static void f() throws Exception {
		System.out.println("Originating the exception in f()");
		throw new Exception("throw from f()");
	}

	static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(), printStackTrace() : ");
			e.printStackTrace(System.out);
			throw e;
		}
	}

	static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h(), printStackTrace() : ");
			e.printStackTrace();
			throw (Exception) e.fillInStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main: printStackTrace(): ");
			e.printStackTrace(System.out);
		}

		try {
			h();
		} catch (Exception e) {
			System.out.println("main: printStackTrace(): ");
			e.printStackTrace(System.out);
		}

	}
}
