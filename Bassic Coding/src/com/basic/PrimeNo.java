package com.basic;

public class PrimeNo {

	
	public static void main(String[] args) {
		
		int num=11;
		boolean prime=true; 
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=false;
				//System.out.println(num+" Not Prime No..."); 
              break;
			}
	
		}
		System.out.println(num+" "+prime); 

		
	for(int i=2;i<Math.sqrt(num);i++) {
		if(num%i==0) {
			prime=false;
		}
	}
	System.out.println(num+" "+prime); 
     	
	
	} 
	
	
	
}
