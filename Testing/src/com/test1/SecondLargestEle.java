package com.test1;

public class SecondLargestEle {

	
	private static int findSecondLargest(int[] arr) {

//		shortcut way in two step
//		Arrays.sort(arr);
//		return arr[arr.length-2];
		
		int largest=0;
		int secondlargest=0;
		
//		always start with both is zero
		// then when problem is ouccer
//          1.when all ele is -ve
//		    2. when all ele is 0. in both case probleam occure
		
//		then you tell that now take Integer.MIN_VALUE for both to handle bag
//		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if(num>largest) {
				secondlargest=largest;
				largest=num;
			}
			else if(num < largest && num >secondlargest) {
				secondlargest=num;
			}
		}
		return secondlargest;
	}
	
	
	public static void main(String[] args) {

		  int[] arr = {10, -20, 4, -95, 99, 45};
	        System.out.println("Second largest element: " + findSecondLargest(arr));
	}

	

}
