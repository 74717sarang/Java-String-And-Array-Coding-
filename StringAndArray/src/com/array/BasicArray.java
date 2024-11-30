package com.array;

import java.util.Arrays;

public class BasicArray {

	public static void main(String []args) {

        int[][] nestedNums = {{0, 1}, {0, 3, 12}};
		int[] nums = { 3, 12,10, 21, 80,  };

		System.out.println("2-D With deepToString()");
        System.out.println(Arrays.deepToString(nestedNums));
		
        System.out.println();
		System.out.println("1-D With deepToString()");
        System.out.println(Arrays.deepToString(new Object[] {nums}));

        System.out.println();
		System.out.println("1-D With toString()");
        System.out.println(Arrays.toString(nums) );

	}
}
