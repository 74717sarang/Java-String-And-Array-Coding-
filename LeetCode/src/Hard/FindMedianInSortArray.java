package Hard;

public class FindMedianInSortArray {

	
	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	              double med;
	             int i=0;
	             int j=0;
	             int k=0;
	             int[]merge=new int[nums1.length+nums2.length];
	       while(i<nums1.length&& j<nums2.length){
	          
	          if(nums1[i]<=nums2[j]){
	            merge[k++]=nums1[i++];
	          }
	         else{
	             merge[k++]=nums2[j++];
	           }
	      }
	        while(i<nums1.length){
	            merge[k++]=nums1[i++];
	             }

	        while(j<nums2.length){
	            merge[k++]=nums2[j++];
	             }

	          if (merge.length % 2 == 1) {
	            return merge[merge.length / 2]; // Odd case, return middle element
	        } else {
	            int mid1 = merge.length / 2;
	            int mid2 = mid1 - 1;
	         med= (merge[mid1] + merge[mid2]) / 2.0; // Even case, return average of two middle elements
	         return med;
	        }

	       }
	    
	    public static void main(String[] args) {
	    	int [] nums1 = {1,2};
	    	int [] nums2 = {3,4};
	    	System.out.println(FindMedianInSortArray.findMedianSortedArrays(nums1, nums2));
		}
	    
	}
	

