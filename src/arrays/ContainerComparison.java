package arrays;

import java.util.ArrayList;
import java.util.Arrays;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;

	@Override
	public String toString() {
		return "Sphere " + id;
	}
}

public class ContainerComparison {
	public static void main(String[] args) {
		BerylliumSphere[] sphere = new BerylliumSphere[5];
		for (int i = 0; i < sphere.length; i++) {
			sphere[i] = new BerylliumSphere();
		}

		System.out.println(Arrays.toString(sphere));
		System.out.println(sphere[4]);
		System.out.println();

		ArrayList<BerylliumSphere> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new BerylliumSphere());
		}
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println();

		int[] integers = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		System.out.println();

		ArrayList<Integer> integers2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
		System.out.println(integers2);
		System.out.println(integers2.get(4));

	}
}
