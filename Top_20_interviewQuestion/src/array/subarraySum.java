package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class subarraySum {

//	Write a java program to find continuous sub array whose sum is
//	equal to a given number?
	
	private static int[] findSubarray(int[] arr, int target) {
         
         for(int i=0;i<arr.length;i++) {
        	 int sum=0;
        	 for(int j=i;j<arr.length;j++) {
        		 sum+=arr[j];
        		 if(sum==target)
        		 {
//        			 System.out.println(+arr[i]+" "+arr[j]);
        			 System.out.println("index in between"); 
        			 return new int[] {i,j};
        		 }
        	 }
         }
		return new int[] {0};
		
	}
	

	private static void sliding_window(int[] arr, int target) {

		Map<Integer, Integer>map=new HashMap<>();
		int left=0,sum=0;
		
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			
			while(sum>target && left<right) {
				sum-=arr[left];
				left++;
			}
			if(sum==target) {
				System.out.println(left+" "+right);
				return; 
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        System.out.println(Arrays.toString(findSubarray(arr, target)));
        
        System.out.println("advance sliding window");
        sliding_window(arr, target);
        
	}


}
