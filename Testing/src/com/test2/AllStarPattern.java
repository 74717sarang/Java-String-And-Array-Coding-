package com.test2;

public class AllStarPattern {

	public static void main(String[] args) {

		int no = 7;

		// Normal triangle

//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  *   
		for (int i = 0; i < no; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");

			}
			System.out.println();
		}

		System.out.println();

		// left side triangle

//	     *
//	    **
//	   ***
//	  ****
//	 *****
//		int n=no;

//		for(int i=0;i<no;i++) {
//			for(int j=0;j<n-1;j++) {
//				System.out.print(" ");
//			
//			}
//			for(int k=0;k<=i;k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			n--;
//		}	

		for (int i = no; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < no - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// ulta triangle

//	 *  *  *  *  * 
//	 *  *  *  * 
//	 *  *  * 
//	 *  * 
//	 * 
		for (int i = no; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");

			}
			System.out.println();
		}

		System.out.println();

		// ulta left tri

//		 ******
//		  *****
//		   ****
//		    ***
//		     **
//		      *

		for (int i = no; i > 0; i--) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// normal triangle

//	        *
//	       ***
//	      *****
//	     *******
//	    *********

		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// Normal ulta triangle

//		   *********
//		    *******
//		     *****
//		      ***
//		       *

//		*only first loop change*
		for (int i = no; i >= 0; i--) {
			for (int j = 0; j < no - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// Normal Square

//		*******
//		*******
//		*******
//		*******

		for (int i = 0; i < no; i++) {
			for (int j = 0; j < no; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		
		
		
		
		
		
		
	}
}