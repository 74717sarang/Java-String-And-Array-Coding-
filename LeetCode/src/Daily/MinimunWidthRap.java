package Daily;

public class MinimunWidthRap {
      //leet code 962
	
	 public  static int maxWidthRamp(int[] nums) {
	     
	     int maxwidth=0;
	     int temp=0;
	      for(int i=0;i<nums.length;i++){
	          for(int j=i+1;j<nums.length;j++){
	            if(nums[i]<=nums[j] && i < j){
	                temp=j-i;
	            }
	          int s=temp;
	         maxwidth=Math.max(maxwidth,s);
	        }
	      }

	     return maxwidth;
	    }
	
	public static void main(String[] args) {
		
//		Example 1:

//			Input: nums = [6,0,8,2,1,5]
//			Output: 4
//			Explanation: The maximum width ramp 
//			is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
		
			int []arr= {6,0,8,2,1,5};
		System.out.println(maxWidthRamp(arr));  //4
		
	}
}
