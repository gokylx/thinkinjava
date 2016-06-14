// A stack implemented with an internal linked structure.
package generics;

public class LinkedStack<T> {
	private class Node<U> {
		U item;
		Node<U> next;

		Node() {
			item = null;
			next = null;
		}

		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}

		boolean end() {
			return (item == null) && (next == null);
		}
	}

	private Node<T> top = new Node<>();

	public void push(T item) {
		top = new Node<T>(item, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}

	public static void main(String[] args) {
		LinkedStack<String> linkedStack = new LinkedStack<>();

		for (String string : "I have a bigger dream.".split(" ")) {
			linkedStack.push(string);
		}
		String string;
		while ((string = linkedStack.pop()) != null) {
			System.out.println(string);
		}
	}

}
