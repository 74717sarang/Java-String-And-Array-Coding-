package com.array;

import java.util.Stack;

public class Braccket {

	public static void main(String[] args) {

		
		String s="()()()";
		int count=0;
		  char[]ch=s.toCharArray();
		
			for(int j=0;j<ch.length;j++) {
			   if(s.charAt(j)=='(') {
				   if(s.charAt(j+1)==')') {
					 count++;   
				   }
			   }
			
		}
		System.out.println("Count::"+count);
	}

}
