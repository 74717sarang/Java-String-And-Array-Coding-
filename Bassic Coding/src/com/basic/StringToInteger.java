package com.basic;

public class StringToInteger {

	public static void main(StringAll[] args) {
        
		String s="12345";
		//System.out.println(3-'0'); 
		System.out.println("int::"+converter(s));
	}

	private static int converter(String s) {
        
		int ans=0,factor=1;
		for(int i=s.length()-1;i>=0;i--) {
			ans+=(s.charAt(i)-'0')*factor;
			factor*=10;
		}
		
		return ans;
	}

	
	
	
}
