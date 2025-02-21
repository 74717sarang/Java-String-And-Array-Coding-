package array;

import java.util.HashSet;
import java.util.Set;

public class Findpair {

//	Q4: Write a java program to find all pairs of elements in an integer 
//	array whose sum is equal to a given number?

	private static void brute_force(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==target) {
					System.out.print(arr[i] + " "+arr[j]);

				}
			}
		}
	}
	
	private static void advance(int[] arr, int target) {

		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int rem=target-arr[i];
			if(set.contains(rem)) {
				System.out.println(arr[i]+" "+rem);
			}
			set.add(arr[i]);
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 3, 8, 2, 5, 7 };
		int target = 9;

		brute_force(arr, target);
//		advance(arr,target);
		

	}

	

}
