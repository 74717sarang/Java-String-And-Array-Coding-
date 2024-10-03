package com.basic;

public class Factorial {

	public static void main(StringAll[] args) {
		int num = 5;
		
		int t = 1;
		//with while loop
		while (num > 0) {
			t = t * num;
			num--;
		}
		int s=1;
		  while(s<num) {
			s=s*num;
					s++;
		  }
		
		
		//using for loop
		int f=1;
		for(int i=1;i<=num;i++) {
			f*=i;
		}
		
		System.out.println("f::" + f);
		
		System.out.println("s::" + s);

		System.out.println("total::" + t);

		System.out.println("facto::" + facto(6));
	}

	//with recursion function
	static int facto(int n) {
		if (n == 0) {
			return 1;
		}
		return n * facto(n - 1);
	}

}
