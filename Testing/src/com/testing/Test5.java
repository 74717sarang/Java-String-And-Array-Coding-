package com.testing;

public class Test5 {

	private static int facto(int i) {
		if (i == 0) {
			return 1;
		}
		return i * facto(i - 1);
	}
	
	public static void main(String[] args) {

	//	System.out.println(facto(5));
	  
		System.out.println(Integer.MAX_VALUE); 
		System.out.println(Integer.MIN_VALUE); 
	
	}

	
}
