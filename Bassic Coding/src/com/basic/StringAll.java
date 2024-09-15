package com.basic;

import java.util.Arrays;

public class StringAll {

	public static void main(String[] args) {

		String str="adbc bcd";
		 System.out.println(str);
		String[] s=str.split(" ");		
	        for(int i=0;i<s.length;i++) {
	        	System.out.println(s[i]);
	        }
	        
	        System.out.println(s[0]);
	
	        char[]ch=str.toCharArray();
	        System.out.println("CH::"+Arrays.toString(ch));
	        
	        System.out.println("String::"+String.valueOf(ch));
	       
	        int n= 42;
	        String  sr=String.format("%s",n);
	        System.out.println(sr+" sr");
	       
	}

}
