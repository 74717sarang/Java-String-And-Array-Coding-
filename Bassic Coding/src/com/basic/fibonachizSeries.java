package com.basic;

public class fibonachizSeries {

	
	public static void main(StringAll[] args) {
		
		int num1=0,num3,num2=1;
		
		 System.out.print("Series:"+num1+","+num2);
		
		int num=10;;
		for(int i=0;i< num;i++) {
			num3=num1+num2;
			System.out.print(","+num3);
			num1=num2;
			num2=num3;
					
		}
		
	}
}
