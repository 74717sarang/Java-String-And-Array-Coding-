package com.test1;

public class PalidromeString {

	
	public static void main(String[] args) {
		String str="asddsa";
		String rev="abc";
		System.out.println("check::"+checkPalidrome(str));		
		System.out.println("String Reverse::"+reverse(rev));
		System.out.println("StringBuilder Reverse::"+reverseStringBuilder(rev));

	}

	private static boolean checkPalidrome(String str) {
		return str.equals(reverse(str));
	}

	private static String reverse(String str) {
        String s="";
		for(int i=str.length()-1;i>=0;i--) {
			s+=str.charAt(i);
		}
		return s;
	}
	
	private static String reverseStringBuilder(String str) {
        
		return new StringBuffer(str).reverse().toString();
	}
	
}
