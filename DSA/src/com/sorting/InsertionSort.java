package com.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 55, 22, 77, 44, 66, 11, 33 };
		int[] ar = sortByInsertion(arr);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	private static int[] sortByInsertion(int[] arr) {

		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key ) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			
			
		}
		
		
		return arr;
	}
}
