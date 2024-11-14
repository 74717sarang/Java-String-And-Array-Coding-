package com.test1;

public class palidromeInt {

	
	public static void main(String[] args) {
		int num=123321;
		int rev=123;
		System.out.println("Num is:"+checkPalidrome(num));
		System.out.println("Return Reverse::"+reverse(rev));
		
	}

	private static int reverse(int r) {
         int rev=0,rem;
         int no=r;
         while(no!=0) {
        	 rem=no%10;
        	 rev=rev*10+rem;
        	 no=no/10;
         }
		return rev;
	}

	public static boolean checkPalidrome(int num) {
          int rev=0,rem;
          int n=num;
          while(n!=0) {
        	  rem=n%10;
        	  rev=rev*10+rem;
        	  n/=10;
          }
		
		return num==rev;
	}
}
