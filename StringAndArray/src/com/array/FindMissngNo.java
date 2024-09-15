package com.array;

public class FindMissngNo {

	public static void main(String[] args) {
		
		int[]number=new int[] {1,2,3,4,6,7};
		  
		int l = number[number.length - 1];
		System.out.println(l);
		 int aTotal=(7*(7+1)/2);
		
		int gtotal=0;
		for(int i:number) {
			gtotal+=i;
		}
		System.out.println("givenTotal::"+gtotal);
		System.out.println("Missing Noa::"+(aTotal-gtotal));
	}
	
	
}
