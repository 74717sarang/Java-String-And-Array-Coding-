package com.basic;

public class SumOfgivenRange {

	public static int sum(int a, int b) {
           int total=0;
		for(int i=a;a<=b;a++) {
			total+=a;
		}
		
		return total;
	}
	
	public static void main(StringAll[] args) {
	
		int a=1;
		int b=10;
		System.out.println("Total::"+sum(a,b));
	}

	
}
