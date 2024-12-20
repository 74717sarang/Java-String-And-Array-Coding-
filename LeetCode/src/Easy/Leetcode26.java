package Easy;

public class Leetcode26 {
	public int removeDuplicates(int[] nums) {
		
		 //this is use extra memory for set 
        //and required is modify nums array
		
//		Set<Integer>set=new HashSet<>();
//		 for(int i=0;i<nums.length;i++){
//		 set.add(nums[i]);
//		 }
////		 return set.size();

	        int uniqueIndex=0;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]!=nums[uniqueIndex]){
	                uniqueIndex++;
	                nums[uniqueIndex]=nums[i];
	            }
	        }
	        return uniqueIndex+1;
	}

	public static void main(String[] args) {
		Leetcode26 solution = new Leetcode26();
		int[] nums = { 1, 1, 2 };
		int newLength = solution.removeDuplicates(nums);
		System.out.println("New length: " + newLength);
	}
}
