package exceptions;

class MyException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
	}

	public MyException(String string) {
		super(string);
	}

}

public class FullExceptions {
	public static void f() throws MyException {
		System.out.println("Throwing MyException from f().");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("Throwing MyExcetion form g()");
		throw new MyException("Originated in  g()");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}

		try {
			gather();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}

	private static void gather() throws MyException {
		f();
		g();
	}

}
