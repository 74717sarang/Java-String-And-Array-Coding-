package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SwapArray {

	public static void main(String[] args) {

		int[]arr= {1,2,3,4,5};
		reversArray(arr);
	     List<Integer>arrayList=Arrays.asList(1,2,3,4,5,6,7,80);
	     List<Integer>ar=arrayList.stream().filter(i->i > 2).collect(Collectors.toList());
		System.out.println(ar);
		
		Optional<Integer>o=arrayList.stream().max((i,j)->i.compareTo(j));
		System.out.println("max:"+o);
		System.out.println("min:"+arrayList.stream().min(Integer::compareTo));
		
 }
 	public static void reversArray(int []arr) {
       
 		IntStream.range(0, arr.length/2)
 		.forEach(i->{
 			//int temp=arr[i];
 			//int [i]=arr[arr.length-i-1];
 			//arr[arr.length-i-1]=temp; 
 		});
		
	}

}
