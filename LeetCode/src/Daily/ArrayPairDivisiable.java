package Daily;

public class ArrayPairDivisiable {

	 public static boolean canArrange(int[] arr, int k) {
		        int j=arr.length-1;
		        boolean flag=true;
		        for(int i=0;i<arr.length/2;i++){
		            int sum=(arr[i])+(arr[j--]);
		             if((sum % k)==0 ){
		                flag=true;
		             }
		             else{
		                flag= false;
		             }
		        }
		        return flag;
	 }
	     
	    
	
	
	
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr[arr.length/2-1]);
		System.out.println(canArrange(arr, 5));
//		int n=Math.abs(arr[0]+arr[arr.length-1]);
//		System.out.println(n);
	}
}
