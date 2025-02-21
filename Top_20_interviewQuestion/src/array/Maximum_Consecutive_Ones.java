package array;

public class Maximum_Consecutive_Ones {

	

	private static int findMaxConsecutive(int[] arr, int k) {

		int max=0;
		int maxCount=0 ;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==k) {
				 max++;
				 maxCount=Math.max(maxCount, max); 
			 }
			 else {
				max=0;
			}
		 }
		
		
		return maxCount;
	}
	
	

	private static int advance(int[] arr, int target) {
      int count=0,maxCount=0;
		 for(int i:arr) {
			 count=(i==target)? ++count:0;
			 maxCount=Math.max(maxCount, count);
		 }
		return maxCount;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        System.out.println("Max consecutive 1s: " + findMaxConsecutive(arr, 1));
        System.out.println("Max consecutive 1s : " + advance(arr, 1));

	}

}
