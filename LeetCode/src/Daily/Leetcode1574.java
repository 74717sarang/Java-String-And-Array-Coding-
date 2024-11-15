package Daily;

public class Leetcode1574 {

	
	 public static int findLengthOfShortestSubarray(int[] arr) {
		int count=0;
		 for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<arr.length;j++) {
			 if(arr[i]< arr[j]) {
				++count;
			}
		}
	 }
		 
		 
		 return count;
		 
	 }
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,10,4,2,3,5};
	System.out.println(findLengthOfShortestSubarray(arr));	
	System.out.println();
	}
	
}
