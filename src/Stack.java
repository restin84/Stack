
public class Stack<T> {

	ListElement<T> stack = null;
	
	public Stack(T t) {
		ListElement<T> newElement = new ListElement<T>(t);
		stack = newElement;
	}
	
	public void push(T t) {
		ListElement<T> newElement = new ListElement<T>(t);
		newElement.setNext(stack);
		stack = newElement;
	}
	
	public T pop() {
		T data = null;
		if(!empty()) {
			data = stack.getData();
			ListElement<T> popped = stack;
			stack = popped.getNext();
			popped.setNext(null);
		}
		return data;
	}
	
	public void printStack() {
		ListElement<T> currentElement = stack;
		
		while(currentElement.getNext() != null) {
			System.out.println(currentElement.getData());
			currentElement = currentElement.getNext();
		}
		System.out.println(currentElement.getData());
	}
	
	public boolean empty() {
		return stack == null;
	}
}
