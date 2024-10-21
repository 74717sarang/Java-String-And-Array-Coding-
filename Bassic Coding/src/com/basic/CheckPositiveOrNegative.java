package com.basic;

import java.util.Scanner;

public class CheckPositiveOrNegative {
	public static String checkno(int num) {
//		if (num == 0)
//			return "nutural no is zero..";
//		if(num>0)
//			return "no is +Ve";
//		return "no is -Ve";
		
		/**/
		
		if(num==0)
			return "no is zero";
	String check=num>0?"no is +ve" :"no is -ve";	
		//System.out.println(check);
      return check;
	}

	public static void main(String[] args) {
		
		//System.out.println("Hello world...!");
		int num;
		Scanner sc=new Scanner(System.in );
		System.out.println("enter no::");
		num=sc.nextInt();
		
		System.out.println(checkno(num));
			sc.close();
			
	
		
	}

}
