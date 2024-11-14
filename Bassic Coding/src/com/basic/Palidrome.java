package com.basic;

public class Palidrome {
	// fast way to find palidrome for String format
	// because it check only half and first to last parallel
	public static boolean find() {
		String abc="123321";
		int l=abc.length();
		for(int i=0;i<l/2;i++ ) {
			if(abc.charAt(i)!=abc.charAt(--l)) {
				return false;
			}
		}
		return true; 
		}
	
	public static void main(String[] args)  {
      System.out.println("findMethode ::"+find());
		/*
       * best optimize way for Int format
		int no=123321;
		int rev=0,rem,num=no;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(no==rev) {
			System.out.println("no is palidrome:::"+no);
		}
		else {
			System.out.println("No is nit palidrome..");
		} 
		*/
		
		 String str="123321";
		 String s="";
		 System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--) {
			 s+=str.charAt(i);
		}
		if(s.equals(str))
		{System.out.println("String is palidrome..");
		}
		else {
			System.out.println("String is  Not palidrome");
		
		}
		
		/*
		String str="123321";
		String s=new StringBuilder(str).reverse().toString();
		if(s.equals(newS))
		{System.out.println("String is palidrome..");
		}
		else {
			System.out.println("String is  Not palidrome");
		
		}
	*/	
		
		/*
		 
//		String newS=new StringBuilder(Integer.toString(number)).reverse().toString();
//		String ss=Integer.toString(number);
//		if(ss.equals(newS))
//		{System.out.println("String is palidrome..");
//		}
		else {
			System.out.println("String is  Not palidrome");
		
		}
		*/
		
	}
}
