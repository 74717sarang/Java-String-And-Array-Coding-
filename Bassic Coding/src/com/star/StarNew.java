
package com.star;

import java.util.Scanner;

public class StarNew {
 
	
	  Scanner sc=new Scanner(System.in);
	//double d=  sc.nextLine()
	  
	public static void main(String[] args) {

		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if((i==1&& j==1)||(i==1&& j==2)|| (i==2&& j==1)||(i==2&& j==2) ) {
					System.out.print(" "+" ");
				}
				
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		int j;
		for(int i=0;i<4;i++) {
		   for( j=0;j<=i;j++) {
			   System.out.print(" "+" ");
		   }
			   for(int k=0;k<=j;k++) { 
			   System.out.print("*"+" ");
		   }
		     
			System.out.println();
		}
		
		}
	}


