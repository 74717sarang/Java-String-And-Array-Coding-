package com.array;

import java.util.HashSet;
import java.util.Set;

public class Leetcode1346 {

	public static boolean checkIfExist(int[] arr) {
	      
		Set<Integer>set=new HashSet<>();
		for(int i:arr) {
			if(set.contains(2*i)||(i%2==0 && set.contains(i/2))) {
				return true; 
				
			}
			set.add(i); 
		}
		
		return false;
	    }	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []arr = {10,2,5,3};
		 
		 System.out.println(checkIfExist(arr)); 
		 
		 String str="abc";
		 System.out.println(str.substring(0, 0));
		 
	}

}
