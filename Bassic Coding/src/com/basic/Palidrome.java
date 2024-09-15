package com.basic;

public class Palidrome {
	public static void main(String[] args)  {
      /*
       * best optimize way
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
		 
		String newS=new StringBuilder(Integer.toString(number)).reverse().toString();
		String ss=Integer.toString(number);
		if(ss.equals(newS))
		{System.out.println("String is palidrome..");
		}
		else {
			System.out.println("String is  Not palidrome");
		
		}
		*/
	}
}
