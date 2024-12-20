package Easy;

import java.util.Arrays;

public class Leetcode88 {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0, j = m; i < n; i++) {
			nums1[j] = nums2[i];
			j++;
		}
		Arrays.sort(nums1);
	}
	
	
	

	public static void main(String[] args) {

//		Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//		Output: [1,2,2,3,5,6]

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;

		System.out.println("Before ...");
		System.out.println(Arrays.toString(nums1));

//		merge(nums1, m, nums2, n);
		System.out.println("After Merge ...");
		
		for(int i=0,j=m;i<nums2.length;i++) {
			nums1[j]=nums2[i];
			j++;
		}
		System.out.println(Arrays.toString(nums1));

		

	}

}
