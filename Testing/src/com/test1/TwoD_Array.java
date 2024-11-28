package com.test1;

import java.util.Arrays;

public class TwoD_Array {

	
	public static void main(String[] args) {
		
    	int[][]grid= {{0,1,1},{1,1,0},{1,1,0}};
		int []arr= {-2,1,-3,4,-1,2,1,-5,4};

    	System.out.println("Using deepToString 2-D Array" );
    	System.out.println(Arrays.deepToString(grid));

    	System.out.println("Using toString 1-D Array");
    	System.out.println(Arrays.toString(arr));
    	
    	System.out.println("Using Loop ");
    	for(int[] i:grid) {
    		System.out.println(Arrays.toString(i));
    	}
    	
	}
}
