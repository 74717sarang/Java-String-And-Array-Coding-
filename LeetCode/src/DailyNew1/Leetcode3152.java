package DailyNew1;

public class Leetcode3152 {

//    boolean[]result=new boolean[queries.length];
    
    //     int[]d=new int[nums.length];

    //     for(int i=1;i<nums.length;++i){
    //         if(nums[i]%2!=nums[i-1]%2){
    //             d[i]=nums[i-1];
    //         }
    //         else{
    //             d[i]=nums[i] ;
    //         }
    //     }

        
    //     for (int i = 0; i < queries.length; ++i) {
    //         result[i] = d[queries[i][1]] <= queries[i][0];
    //     }  

    //   return result

	
	public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
	    int n = nums.length;
	    int[] d = new int[n];
	    d[0] = 0; // The first element starts its "special" subarray at index 0

	    // Fill the array d with leftmost "special" subarray indices
	    for (int i = 1; i < n; ++i) {
	        if (nums[i] % 2 != nums[i - 1] % 2) {
	            d[i] = d[i - 1];
	        } else {
	            d[i] = i;
	        }
	    }

	    boolean[] result = new boolean[queries.length];
	    for (int i = 0; i < queries.length; ++i) {
	        result[i] = d[queries[i][1]] <= queries[i][0];
	    }

	    return result;
	}

	
	
	
	public static void main(String[] args) {
		
		
		//check leetcode for it 
	}
	
}
