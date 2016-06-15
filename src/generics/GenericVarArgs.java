package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericVarArgs {
	@SafeVarargs
	public static <E> List<E> makeList(E... args) {
		List<E> arrayList = new ArrayList<E>();
		for (E e : args) {
			arrayList.add(e);
		}
		return arrayList;
	}

	public static void main(String[] args) {
		List<String> list = makeList("A");
		System.out.println(list);
		list = makeList("A", "B");
		System.out.println(list);
		list = makeList("ABCDEFGHIGKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(list);

	}
}
