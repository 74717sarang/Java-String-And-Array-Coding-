package DailyNew1;

public class Leetcode2425 {

	    public static  int xorAllNums(int[] nums1, int[] nums2) {
	        int xor1=0;int xor2 = 0;
	        for (int i : nums1) {
	            xor1 ^= i;
	        }
	        for (int i : nums2) {
	            xor2 ^= i;
	        }
	        int m=nums1.length;
	        int n=nums2.length;
	           if(m%2==0 && n%2==0){
	            return 0;
	           }
	           else if(m%2==1 && n%2==1){
	            return xor1 ^ xor2;
	           }
	           else if(m%2==1){
	            return xor2;
	           }
	           else{
	            return xor1;
	           }
	    }

	public static void main(String[] args) {
		// Example Input
        int[] nums1 = {2, 1, 3};
        int[] nums2 = {10, 2, 5, 0};

        // Result
        int result = xorAllNums(nums1, nums2);

        // Output the result
        System.out.println("The XOR of all pairings is: " + result);
	//output=13
	}

}
