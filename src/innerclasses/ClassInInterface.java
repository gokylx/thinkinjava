package innerclasses;

public interface ClassInInterface {
	public void howdy();

	class Test implements ClassInInterface {

		@Override
		public void howdy() {
			System.out.println("Howdy!");
		}

		public static void main(String[] args) {
			Test test = new Test();
			test.howdy();
		}

	}
}
