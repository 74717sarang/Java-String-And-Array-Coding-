package com.test2;

public class Buterfly {
	public static void main(String[] args) {
 
		int n=7;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n;j++) {
				if(i<j && j<=2*n-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		// second
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=2*n;j++) {
				if(i<j && j<=2*n-i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
