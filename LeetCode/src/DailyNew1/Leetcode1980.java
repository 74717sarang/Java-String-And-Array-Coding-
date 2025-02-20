package DailyNew1;

public class Leetcode1980 {

	    public static String findDifferentBinaryString(String[] nums) {
	        int n=nums.length;
	        StringBuilder sb=new StringBuilder();

	        for(int i=0; i<n; i++){   
	            if(nums[i].charAt(i)=='0'){         
	                sb.append('1');
	            }else{
	                sb.append('0');
	            }            
	        }
	        
	        return sb.toString();
	    }

	
	
	
	public static void main(String[] args) {

//		Input: nums = ["01","10"]
//				Output: "11"
//				Explanation: "11" does not appear in nums. "00" would also be correct.
	
	String[]nums = {"01","10"};
	 System.out.println(findDifferentBinaryString(nums));
	}

}
