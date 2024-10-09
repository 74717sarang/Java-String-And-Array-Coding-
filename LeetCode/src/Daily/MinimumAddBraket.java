package Daily;

import java.util.Stack;

public class MinimumAddBraket {

	// using normal if else
	public static int find(String s) {
		int open = 0;
		int close = 0;

		for (char ch : s.toCharArray()) {

			if (ch == '(') {
				open++;
			} else {
				if (open > 0) {
					open--;
				} else {
					close++;
				}
			}

		}
		return open + close;
	}

	// using stack

	public static int findMinimumBraket(String s) {
		Stack<Character> stack = new Stack<>();
		int notMatch = 0;
		for (char ch : s.toCharArray()) {

			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					notMatch++;
				}
			}

		}

		return notMatch + stack.size();

	}

	public static void main(String[] args) {

		String s = "((()"; // o/p: 2 
		System.out.println(MinimumAddBraket.findMinimumBraket(s));

		String s1 = "((("; // o/p: 3 
		System.out.println(MinimumAddBraket.findMinimumBraket(s1));
	}
}
