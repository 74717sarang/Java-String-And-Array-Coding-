package com.test2;

import java.util.Stack;

public class BraketCheck {

	private static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isBalancedcheck(String str) {
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("{[()]}")); // true
		System.out.println(isBalanced("{[(])}")); // false

		System.out.println("is check  "+isBalancedcheck("((()))")); // true

	}

}
