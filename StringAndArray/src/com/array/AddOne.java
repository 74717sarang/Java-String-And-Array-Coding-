package com.array;

public class AddOne {
	// add one in last digit
	// 123=>124 output
	// 1239=>1240 output
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9 };
		if (arr[arr.length - 1] == 9) {
			arr[arr.length - 1] = 0;
			arr[arr.length - 2] = arr[arr.length - 2] + 1;
		} else if (arr[arr.length - 1] != 9) {
			arr[arr.length - 1] = arr[arr.length - 1] + 1;
		}

//		System.out.println(arr[arr.length-1]);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
