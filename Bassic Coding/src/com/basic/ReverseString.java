package com.basic;

import java.util.Stack;

public class ReverseString {

	public static String reverseSrtring1(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}
//		String s = new String(arr);
		String s = "";

		for (char c : arr) {
			s += c;
		}

		return s;
	}

	public static String reverseSrtring2(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}
//		String s = new String(arr);
		String s = "";

		for (char c : arr) {
			s += c;
		}

		return s;
	}

	public static String reverseStrStack(String str) {
		String s = "";
		Stack<Character>stack=new Stack<>();
		for(char c:str.toCharArray()) {
			stack.push(c); 
		}
      while(!stack.isEmpty() ) {
			s+=stack.pop();
		}

		return s;
	}

	public static void main(String[] args) {

		String str = "abccba";

		StringBuilder builder = new StringBuilder(str).reverse();
		System.out.println(builder.toString().equals(str));

		System.out.println(reverseSrtring1(str));
		System.out.println(reverseSrtring2(str));
		System.out.println("using stack:"+reverseStrStack(str));

	}

}
