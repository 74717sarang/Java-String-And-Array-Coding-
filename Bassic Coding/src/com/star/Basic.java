package com.star;

public class Basic {

	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}
		System.out.println("A");
		System.out.println();

		int a = 5;
		for (int i = a; i >= 0; i--) {
			for (int j = a; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
