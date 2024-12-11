package leetcode75challenge.prefixSum;

public class leetcode724 {
	
	
	// best way
	public static  int 	pivotIndexNewBestWay(int[] nums) {
	
		int righttotal=0;
		for(int i=0;i<nums.length;i++) {
			righttotal+=nums[i];
		}
		int lefttotal=0;
		for(int i=0;i<nums.length;i++) {
			righttotal-=nums[i];
			if(lefttotal==righttotal) {
				return i; 
			}
			lefttotal+=nums[i];
		}
		
		
		return -1;
	}
	

	public static int pivotIndex(int[] nums) {
        int total = 0;
        int leftsum=0;
        for(int i:nums){
            total+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(leftsum==total-nums[i]-leftsum){
                return i;
            }
            leftsum+=nums[i];
         }

        return -1;
    }
	public static  int pivotIndexNew(int[] nums) {
		int len=nums.length;
		
		int[]leftSum=new int[len];
		int[]rightSum=new int[len];
		leftSum[0]=0;
		for(int i=1;i<nums.length;i++) {
			leftSum[i]=leftSum[i-1]+nums[i-1];
		}
		
		rightSum[len-1]=0;
		for(int i=len-2;i>=0;i--) 
		{
			rightSum[i]=rightSum[i+1]+nums[i+1];
		}
		
		for(int i=0;i<nums.length;i++) {
			if(leftSum[i]==rightSum[i]) {
				return i; 
				
			}
		}
		
		return -1;
	}

	
	public static void main(String[] args) {
	
//		The pivot index is 3.
//		Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//		Right sum = nums[4] + nums[5] = 5 + 6 = 11
		
		
//		Input: nums = [1,7,3,6,5,6]
//				Output: 3
		int[]nums = {1,7,3,6,5,6};
		System.out.println(pivotIndex(nums));
		System.out.println("new fun.");
		System.out.println(pivotIndexNew(nums));
		System.out.println("Best fun.");
		System.out.println(pivotIndexNewBestWay(nums));

	}
}
