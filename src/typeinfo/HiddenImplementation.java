package typeinfo;

import java.lang.reflect.Method;

import typeinfo.interfacea.A;
import typeinfo.packageacess.HiddenC;

public class HiddenImplementation {
	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getSimpleName());
		callHiddenMethod(a, "g");
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "k");
		callHiddenMethod(a, "z");
	}

	static void callHiddenMethod(Object object, String methodName) throws Exception {
		Method m = object.getClass().getDeclaredMethod(methodName);
		m.setAccessible(true);
		m.invoke(object);
	}
}
