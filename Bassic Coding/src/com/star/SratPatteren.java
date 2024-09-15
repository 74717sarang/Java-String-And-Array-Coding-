package com.star;

public class SratPatteren {
	public static void main(String[] args) {
		/*
		 * int num=7; for(int i=0;i<=num;i++) { for (int j=0;j<=num;j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		int num = 7;
		for (int i = num; i >=0; i--) {
			for (int j = 0; j < i; j++) {
				System.out .printf("*"+" ");
			}
			System.out.println();
		}

	}

}
