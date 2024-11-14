package com.star;

public class Test {

	public static void main(String[] args) {

//		System.out.println("Hello world");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();

		
		int row=5;
		for(int i=0;i<=row;i++) {
			for(int j=0;j<row-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	for(int i=0;i<=row;i++) {
		for(int j=0;j<row-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<2*i+1;k++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	System.out.println();
		
	for(int i=row;i>=0;i--) {
		
		for(int j=0;j<row-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<2*i+1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println();
    int no=1;
   int r=3;
	for(int i=0;i<r;i++) {
		for(int j=0;j<r-i;j++) {
			System.out.print(" "+" ");
		}
		for(int k=0;k<2*i+1;k++) {
			System.out.print(no+++" ");
		}
		System.out.println();
	}
System.out.println();	
	
	
  for(int i=0;i<=row;i++) {	
	  for(int j=0;j<=row;j++) {
		  if(i==0 || i==row || j==0 || j==row) {
			  System.out.print("*");
		  }else {
			System.out.print(" ");
		}
	  }
	  System.out.println();
  }






		
	}
}
