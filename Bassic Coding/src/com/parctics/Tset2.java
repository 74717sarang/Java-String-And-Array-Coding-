package com.parctics;

import java.util.HashMap;
import java.util.Map;

public class Tset2 {

	public static void main(String[] args) {

		
		Map<Integer, String>map=new HashMap<>();
		
		int k=3;
		String  s="welcometojava";
		String []str=s.split("(?<=\\G...)");
	          
		// str1+=s.substring(i, i+k)+" "; i=0;i<lenth-k;i++
	     String str1=" ";
	     for(String f:str) {
	    	 System.out.print(f+" " );
	     }
	     System.out.println();
		for(int i=0;i<str.length-1;i++) {
			 for(int j=i+1;j<str.length;j++) {
				 if(str[i].compareTo(str[j])> 0) {
					 String temp=str[i];
					 str[i]=str[j];
					 str[j]=temp;
				 }
			 }
		}
		
		 for(String f:str) {
	    	 System.out.print(f+" " );
	     }

	   
	}

}
