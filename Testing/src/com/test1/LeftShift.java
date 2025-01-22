package com.test1;

public class LeftShift {

	private static String leftShitString(String str, int n) {

		str = str.substring(n) + str.substring(0, n);

		return str;
	}

	
	private static String rightShift(String str, int right) {

		String result = "";
		result = str.substring(right) + str.substring(0, right);

		return result;
	}

	public static void main(String[] args) {

		int left = 2;
		String str = "doselect";
		int right = 6;

		
		System.out.println("Actual: "+str); 
		
		System.out.println("leftShift:  " + leftShitString(str, left));
		System.out.println("RightLeft:  " + rightShift(str, right));

		
//		cysleling shift
//     for(int i=1;i<=5;i++) {
// 		System.out.println(leftShitString(str,i));
//     }

	}

}
