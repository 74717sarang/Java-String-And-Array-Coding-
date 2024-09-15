package com.basic;

public class Recursion {

	public static void main(StringAll[] args) {
		 int num = 123321;
           int r= findrevers(num);
           
           System.out.println(r);
           if(num==r)
           { System.out.println("No is Palidrome...");
               return;
           }
           else {
    	   System.out.println("No is Not Palidrome...");
           }
	      //getReverse (num);

	}
	   static int findrevers(int num) {
		    int rev=0;
		   if(num==0) {
             return rev;      // check condition recursion
		   }
		   int rem=num%10;
		   System.out.print(rem);   //use print only 
		 return  findrevers(num / 10);
	   }
	 
}
