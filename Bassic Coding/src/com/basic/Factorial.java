package com.basic;

public class Factorial {

	public static void main(StringAll[] args) {
		int num = 5;
		int t = 1;
		while (num > 0) {
			t = t * num;
			num--;
		}
		System.out.println("total::" + t);

		System.out.println("facto::" + facto(6));
	}

	static int facto(int n) {
		if (n == 0) {
			return 1;
		}
		return n * facto(n - 1);
	}

}
