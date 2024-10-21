package com.basic;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="abccba";
		
		StringBuilder builder=new StringBuilder(str).reverse();
		  System.out.println(builder.toString().equals(str));
		
		  char[]arr=str.toCharArray();
		for(int i=0;i<arr.length/2;i++) {
			char temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		  String s=new String(arr);
		  System.out.println(s.equals(str));
		  System.out.println(reverseSrtring(str));
		  
		  
		 
		  
	} 
	public static String reverseSrtring(String str) {
		String s="";
		char[]arr=str.toCharArray();
		for(int i=0;i< arr.length;i++) {
			s+=arr[arr.length-1-i];  // Trick to point last index
		}
//		
//		with this direct travel
//		for(int i=arr.length-1;i>=0;i--) {
//			s+=arr[i];
//		}
		return s;		
	}

	
}
