package com.testing;

public class Test4 {

	public static void main(String[] args) {

		System.out.println(facto(5));
	}

	private static int facto(int i) {
		if (i == 0) {
			return 1;
		}
		return i * facto(i - 1);
	}
}
