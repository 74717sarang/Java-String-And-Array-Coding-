package Medium;

public class FindTargetBinarySearch {

	
	//using binary search
	private static int findtarget(int[] arr, int target) {

		int left=0;
		int right=arr.length-1;
		//int mid;
		while(left<=right) {
			
		int	mid=left+(right-left)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
		  if(arr[left] <= arr[mid]) {
			  
			  if(arr[left]<=target && target < arr[mid] ) {
				 right=mid-1; 
			  }
			  else {
				left=mid+1;
			}
			  
		  }else {
			if(arr[mid]<=target && target <arr[right]) {
				
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
			
		}
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int target=5;
		int[]arr= {1,2,3,4,5,6,7};
	
		System.out.println(findtarget(arr,target)); // o\p:4
	}

	
	
}
