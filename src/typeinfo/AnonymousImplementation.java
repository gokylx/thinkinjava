package typeinfo;

import typeinfo.interfacea.A;

class AnonymousA {
	public static A makeA() {
		return new A() {
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("public f()");
			}

			@SuppressWarnings("unused")
			public void g() {
				System.out.println("public g()");
			}

			@SuppressWarnings("unused")
			void k() {
				System.out.println("package k()");
			}

			@SuppressWarnings("unused")
			protected void r() {
				System.out.println("protected r()");
			}

			@SuppressWarnings("unused")
			private void z() {
				System.out.println("private z()");
			}
		};
	}
}

public class AnonymousImplementation {

	public static void main(String[] args) throws Exception {
		A a = AnonymousA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "k");
		HiddenImplementation.callHiddenMethod(a, "r");
		HiddenImplementation.callHiddenMethod(a, "z");

	}
}
