// Using inner classes for callbacks.

package innerclasses;

interface Incrementable {
	void increment();
}

// Very simple to just implements interface
class Callee1 implements Incrementable {
	private int i = 0;

	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}

}

class MyIncrement {
	public void increment() {
		System.out.println("Another increment");
	}

	static void f(MyIncrement min) {
		min.increment();
	}
}

// If your class must implements increment() in some other way
// you must use an inner class.
class Callee2 extends MyIncrement {
	private int i = 0;

	@Override
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}

	private class Closure implements Incrementable {

		@Override
		public void increment() {
			// Specify outer-class method, otherwise you'd get an infinite
			// recursion.
			Callee2.this.increment();
		}

	}

	Incrementable getCallbackReference() {
		return new Closure();
	}

}

class Caller {
	private Incrementable getCallbackReference;

	Caller(Incrementable incrementable) {
		getCallbackReference = incrementable;
	}

	void go() {
		getCallbackReference.increment();
	}
}

public class Callbacks {
	public static void main(String[] args) {
		Callee1 callee1 = new Callee1();
		Callee2 callee2 = new Callee2();
		MyIncrement.f(callee2);

		Caller caller1 = new Caller(callee1);
		Caller caller2 = new Caller(callee2.getCallbackReference());

		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();

	}
}
