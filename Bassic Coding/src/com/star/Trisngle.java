package com.star;

public class Trisngle {
	public static void main(String[] args) {

		
		int n = 5;
		
		int space=n-1;
		for(int i=0;i<n;i++ ) {
		   for(int j=0;j<space;j++) {
			   System.out.print(" ");
		   }
	       for(int k=0;k<=i;k++) {
	    	   System.out.print("*");
	       }
			System.out.println();
			space--;
		}
		
		
		
		
//		for (int i = 0; i <= n; i++) {
//			
//			for (int j = 0; j <=n - i+1; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i + 1; k++) {
//				if(i==0) {
//				System.out.print("  * ");
//				  break;
//				}
//				System.out.print(" * ");
//
//			}
//
//			System.out.println();
//		}
	}
}
