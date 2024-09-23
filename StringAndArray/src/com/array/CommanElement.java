package com.array;

import java.util.ArrayList;

public class CommanElement {

	
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 4, 5 ,3};
		int[] arr2 = { 1, 2 ,3,5,8};
      
		//int[] arr = new int[arr1.length] ;
        ArrayList<Integer>list=new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
//					arr[i] = arr1[i];
					list.add(arr1[i]);
				}
			}

		}
		list.forEach(System.out::println);

	}

}
