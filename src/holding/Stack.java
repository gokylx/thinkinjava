// Making a Stack from a LinkedList;

package holding;

import java.util.LinkedList;

public class Stack<E> {
	private LinkedList<E> storage = new LinkedList<E>();

	public void push(E e) {
		storage.addFirst(e);
	}

	public E peep() {
		return storage.getLast();
	}

	public E pop() {
		return storage.removeFirst();
	}

	public boolean isEmpty() {
		return storage.isEmpty();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return storage.toString();
	}

}
