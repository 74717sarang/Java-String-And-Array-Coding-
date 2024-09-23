package com.array;

import javax.annotation.processing.SupportedSourceVersion;

public class Specialindex {

	public static void main(String[] args) {
		
		//XOR
		int []index1= {4,2,5,7,1,3};
		int inedx=6;
	
		System.out.println(findIndex(inedx,index1));
		
	}

	public static int findIndex(int inedx, int[] index1) {
		
		int XORsum=0;
		for(int i:index1) {
			XORsum^=i;
			//System.out.println(XORsum);
		}
		for(int i=0;i<inedx;i++) {
			int xor=XORsum^index1[i];
			if(index1[i] > xor ) {
				return i;
			}
		}
		
		
		return -1;
	}
	
}
