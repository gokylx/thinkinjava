package holding;

public class StackCollision {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String string : "I hava a dog pip.".split(" ")) {
			stack.push(string);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " ");
		}

		System.out.println();

		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		for (String string : "I have a dog pip.".split(" ")) {
			stack2.push(string);
		}
		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop() + " ");
		}
	}
}
