package innerclasses;

import innerclasses.MNA.A;
import innerclasses.MNA.A.B;

// Nested class can access all members of all levels
// of all the classes they are nested within
class MNA {
	private void f() {
	};

	class A {
		private void g() {
		};

		class B {
			void h() {
				f();
				g();
			}
		}
	}
}

public class MuiltNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		A a = mna.new A();
		B b = a.new B();
		b.h();
	}
}
