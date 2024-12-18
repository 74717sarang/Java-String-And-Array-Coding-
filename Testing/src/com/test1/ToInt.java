package com.test1;

public class ToInt {

	public static void main(String[] args) {
		String str="123";
		int num=0;
		for(int i=0;i<str.length();i++) {
			num=num*10+(str.charAt(i)-'0');
		}
		System.out.println("Int::"+num);
		
		
		int x=5;
		System.out.println(++x + " "+ x++);
	}
	
}
