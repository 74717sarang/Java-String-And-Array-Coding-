package com.basic;

public class SumOfNuturalNo {


	private static int sum(int num) {
     int total=0;
		for(int i=0;i<=num;i++){
		 total+=i;
			
		}
		
		
		return total;
	}
	
	public static void main(StringAll[] args) {
		int num=5;
		System.out.println(sum(num));
		// direct with formula
	  System.out.println("total="+(num*(num+1)/2));
	  System.out.println("sum n no;"+(num*(num+1)));
	}

}
