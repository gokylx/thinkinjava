package generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<E> {
	private ArrayList<E> list = new ArrayList<>();
	private Random random = new Random(47);

	public void add(E e) {
		list.add(e);
	}

	public E select() {
		return list.get(random.nextInt(list.size()));
	}

	public static void main(String[] args) {
		RandomList<String> randomList = new RandomList<>();

		for (String string : "I hava a bigger dream.".split(" ")) {
			randomList.add(string);
		}

		for (int i = 0; i < 11; i++) {
			System.out.println(randomList.select() + "  ");
		}
	}
}
