package holding;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for (String string : "I hava a dog.".split(" ")) {
			stack.push(string);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}
	}
}
