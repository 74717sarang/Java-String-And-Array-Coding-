package com.star;

public class ButterFly {

	public static void main(String[] args) {

		int n = 7;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n; j++) {

				// To print spaces
				if (j > i && j <= 2 * n - i) {
					System.out.print(" ");
				}
				// To print stars
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// only reverse outer loop
		for (int i = n; i >= 0; i--) {
			for (int j = 1; j <= 2 * n; j++) {

				// To print spaces
				if (j > i && j <= 2 * n - i) {
					System.out.print(" ");
				}
				// To print stars
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println();
	}

}
