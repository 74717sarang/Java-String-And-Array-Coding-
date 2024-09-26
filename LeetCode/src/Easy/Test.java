package Easy;

import java.util.ArrayList;

public class Test {
	
	public static int removeElement(int[] nums, int val) {
	       int []arr=new int[]{};
	       
	       ArrayList<Integer>list=new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=val){
	               list.add(nums[i]);
	               
	            }
	        }
	        return list.size();
	    }
	public static void main(String[] args) {

		int []arr= {0,1,2,2,3,0,4,2};
		System.out.println("Size::"+removeElement(arr, 2));
	}

}
