package com.array;

public class MergeArray {

	private static int[] zigzigArray(int[] arr1, int[] arr2) {

		int L = arr1.length + arr2.length;
		System.out.println("Length::"+L);
		int[] merge = new int[L];
		int k=0;
		for (int i = 0; i < merge.length;i++) {
		
			if (i < arr1.length) {
				merge[k++] = arr1[i];
				//k++;
			}
			if (i < arr2.length) {
				merge[k++] = arr2[i];
				//k++;
			}}
		/*
		 
		 //with while loop
		int i ,k= 0,j=0;
		while (i<arr1.length && j<arr2.length) {
			merge[k++]=arr1[i++];
			merge[k++]=arr2[j++];  
			
		}
         while(i<arr1.length) {
        	 merge[k++]=arr1[i++];
         }
         while(j<arr2.length) {
        	 merge[k++]=arr1[j++];
         }
	*/	
    
		return merge;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 6, 8,10,12 };

		int[] merge = zigzigArray(arr1, arr2);

		for (int i = 0; i < merge.length; i++) {
			System.out.println(merge[i]);
		}
		
	}

}
