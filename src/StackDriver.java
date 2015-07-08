
public class StackDriver {

	public static void main(String[] args) {
		Stack<String> testStringStack = new Stack<String>("first element");
		testStringStack.push("second element");
		testStringStack.push("third element");
		while(!testStringStack.empty()) {
			System.out.println(testStringStack.pop());
		}
		
		Stack<Integer> testIntStack = new Stack<Integer>(1);
		testIntStack.push(2);
		testIntStack.push(3);
		while(!testIntStack.empty()) {
			System.out.println(testIntStack.pop());
		}
		
	}

}
