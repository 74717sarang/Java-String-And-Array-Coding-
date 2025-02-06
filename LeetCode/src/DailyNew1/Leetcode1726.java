package DailyNew1;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1726 {

	    public static int tupleSameProduct(int[] nums) {
	   Map<Integer,Integer>map=new HashMap<>();

	    for(int i=0;i<nums.length;i++){
	        for(int j=i+1;j<nums.length;j++){
	          int product=nums[i]*nums[j];
	          map.put(product,map.getOrDefault(product,0)+1);
	        }
	    }        

	    int count=0;
	    for(int i:map.values()){
	        if(i>1){
	            count+=i*(i-1)*4;
	        }
	    }
	     return count;
	    }
	
	
	
	public static void main(String[] args) {

//		Input: nums = [2,3,4,6]
//				Output: 8
//				Explanation: There are 8 valid tuples:
//				(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
//				(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
		
		
		int[]nums = {2,3,4,6};
		System.out.println(tupleSameProduct(nums));
		
	}

}
