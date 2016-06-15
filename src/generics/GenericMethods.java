package generics;

public class GenericMethods {
	public <E> void f(E e) {
		System.out.println(e.getClass().getName());
	}

	public static void main(String[] args) {
		GenericMethods methods = new GenericMethods();
		methods.f("");
		methods.f(1);
		methods.f('c');
		methods.f(1.2f);
		methods.f(1.2);
		methods.f(methods);
	}
}
