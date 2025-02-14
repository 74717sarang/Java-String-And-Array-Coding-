package com.test1;

public class Star {

	public static void main(String[] args) {

		System.out.println("adjecment");
		int no = 6;
		for (int i = 0; i < no; i++) {

			for (int j = no - i; j > 1; j--) {
				System.out.print(" " + "");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("---------------");
       System.out.println("with formula");
       
		
		
		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" "+ " ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();

		}
	}

}
