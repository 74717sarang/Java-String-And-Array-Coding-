package com.array;

public class FindMaxAndMinEle {

	public static void main(String[] args) {

		
		int[]arr= {4,5,2,9,7,8,3,6};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max:"+max);
		
		
	}

}
