package Medium;

import java.util.Arrays;

public class Leetcode75 {

	// direct solve inbuild methode
	public void sortColors(int[] nums) {
		Arrays.sort(nums);
		Arrays.toString(nums);
	}

	public  void sortColors1(int[] nums) {

    	int mid=0;int left=0;int right=nums.length-1;
    	while(mid<=right) {
    		
    		if(nums[mid]==0) {
    			swap(nums,mid,left);
    			mid++;
    			left++;
    			
    		}else if(nums[mid]==1) {
               mid++;    			
    		}else {
				swap(nums, mid, right);
				right--;
			}
    		
    		
    	}
    	
    	
        }

	private void swap(int[] nums, int mid, int left) {

		int temp=nums[mid];
		nums[mid]=nums[left];
		nums[left]=temp;
		
	}

	public static void main(String[] args) {

		
		Leetcode75 obj=new Leetcode75();
		
		int[]arr= {2,0,2,1,1,0};
          obj.sortColors1(arr);	
  		Arrays.toString(arr);

	}

}
