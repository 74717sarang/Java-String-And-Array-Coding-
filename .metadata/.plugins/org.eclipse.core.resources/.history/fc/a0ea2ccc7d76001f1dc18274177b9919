package com.array;

import java.util.Arrays;

public class SubArrayDivide {

	public static void main(String[] args) {
		
	int []arr=new int[]{2,3,1,5,4};	
     int subLength=3;
	int []sumarr=new int[arr.length-subLength+1] ;
		for(int i=0;i<arr.length;i++) {
			int multipleSum=1;
			for(int j=i;j<i+subLength && j<arr.length ;j++) {
				multipleSum*=arr[j];
			}
			
			  if(i<arr.length-subLength+1)
			   {
				  sumarr[i]=multipleSum;
				  System.out.print(sumarr[i]+" ");
			   }
			  System.out.println(); 
			  
		}
	    Arrays.sort(sumarr);
	    System.out.println("max multi. sub array:: "+sumarr[sumarr.length-1]);
	}
	
}
