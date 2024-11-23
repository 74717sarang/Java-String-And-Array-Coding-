package com.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
      int num=153;
      armstrongNumber(num);
      System.out.println(Math.pow(3,2));
	}

	private static void armstrongNumber(int num) {
       
		int original=num;
		int sum=0;
		int digits=String.valueOf(num).length();
		while(num>0)
		{
			int rem=num%10;
			sum+=Math.pow(rem, digits);
			num/=10;
		}
		if(original==sum) {
			System.out.println("armstrongNumber");
		}
		else {
			System.out.println("Not armstrongNumber");
		}
	}

}
