package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 55, 22, 77, 44, 66, 11, 33 };
		int[] ar = sortbubble(arr);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
//why bubbleSort-> it take big No at Top like bubble
	public static int[] sortbubble(int[] arr) {
      boolean flag;  // with flag we can reduce the iteration if already sorted array
      
		for(int i=0;i<arr.length-1;i++) {
    	  flag=false;
    	 for(int j=0;j<arr.length-1;j++) {
    	 if(arr[j]<arr[j+1]) {
    		 int temp=arr[j];
    		 arr[j]=arr[j+1];
    		 arr[j+1]=temp;
    		 flag=true;
    	 }
    	
    	}
    	 if(!flag) {
 			break;
 		}
     }
		
		
		
		return arr;
	}

}
