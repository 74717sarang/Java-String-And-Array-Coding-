package com.basic;

public class StringToInteger {


	private static int newconverter(String s) {
          int num=0;
          for(char ch:s.toCharArray()) {
        	  num=num*10+(ch-'0');
          }
          
		return num;
	}

	private static int converter(String s) {
        
		int ans=0,factor=1;
		for(int i=s.length()-1;i>=0;i--) {
			ans+=(s.charAt(i)-'0')*factor;
			factor*=10;
		}
		
		return ans;
	}
	
	
	
	
	public static void main(String[] args) {
        
		String s="12345";
		System.out.println('3'-'0'); 
		System.out.println("int::"+converter(s));
		System.out.println("Int::"+newconverter(s));
	}
}
