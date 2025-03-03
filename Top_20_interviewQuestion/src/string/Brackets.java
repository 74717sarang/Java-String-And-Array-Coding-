package string;

import java.util.Stack;

//Check for Balanced Brackets
public class Brackets {

	private static boolean advance(String str) {
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {

				if (stack.isEmpty() || stack.pop() != '(')
					return false;

			}
		}
		return stack.isEmpty();

	}

	private static boolean isBalancedcheck(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				if (c == ')' && top != '(') {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "((())";
		System.out.println(advance(str));
		System.out.println(isBalancedcheck(str));

	}

}
