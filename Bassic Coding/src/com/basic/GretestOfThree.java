package com.basic;

public class GretestOfThree {

	public static void big(int a, int b, int c) {
		if((a==b)&&(b==c))
			{System.out.println("No Are Equales...");
			  return;
			}
		
		if(a>b && a>c) {
	    	   System.out.println("A is Greter..."+a);
	    	   return;
		}
		if(b>c && b>a) {
	    	   System.out.println("B is Greter..."+b);return;

		}
		else {
	    	   System.out.println("c is Greter..."+c);
		}
	}
	  
	
	
	public static void main(StringAll[] args) {
		int a=111,b=872,c=7773;
		//gretest(a,b,c);
		big(a,b,c);
	}

	private static void gretest(int a, int b, int c) {

		if((a==b)&&(b==c))
			System.out.println("No Are Equales...");
		 else if (a>b) {
			       if(a>c)
			    	   System.out.println("A is Greter..."+a);
			
		}
		
		else if (b>c) {
			   System.out.println("B is Greter..."+b);
		}
		else if (c>a) {
			   System.out.println("c is Greter..."+c);
		} 
	}
}
