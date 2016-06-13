package typeinfo.packageacess;

import typeinfo.interfacea.A;

class C implements A {

	@Override
	public void f() {
		System.out.println("public C.f()");
	}

	public void g() {
		System.out.println("public C.g()");
	}

	void u() {
		System.out.println("package C.u()");
	}

	protected void k() {
		System.out.println("protected C.k()");
	}

	@SuppressWarnings("unused")
	private void z() {
		System.out.println("private C.z()");
	}

}

public class HiddenC {
	public static A makeA() {
		return new C();
	}
}
