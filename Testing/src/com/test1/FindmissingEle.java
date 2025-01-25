package com.test1;

public class FindmissingEle {

	private static int findEle(int[] arr, int n) {

		// other way is sort arr and return n-1 ele

		// this using formule for sum of N natural numbers
		int totalSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int i : arr) {
			actualSum += i;
		}

		return totalSum - actualSum;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6 };
		int n = 6;
		System.out.println("Missing Element:" + findEle(arr, n));
	
	 String str1="Hello";
	 String str2=str1;
	 
	 str1="world";
	 System.out.println(str1);
	 System.out.println(str2);
	
	}

}
