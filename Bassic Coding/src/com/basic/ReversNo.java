package com.basic;

public class ReversNo {

	private static int revers(int n) {
		int rem = 0, rev = 0;
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev;
	}
	public static void main(StringAll[] args) {
		int num = 123;
		System.out.println(revers(num));
		
		//using for loop
		int rev = 0,rem=0;
	   for( ;num!=0;num/=10 ) {
		   rem=num%10; 
		   rev=rev*10+rem;
	   }
		System.out.println( "rev::"+rev);
	
		
	}

}
