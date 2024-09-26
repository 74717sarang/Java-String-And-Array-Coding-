package sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {55,22,33,44,11};
		int[] ar = sort(arr);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

	private static int[] sort(int[] arr) {
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr.length;j++) {
            	 if(arr[i]<arr[j]) {
            		 int temp=arr[i];
            		 arr[i]=arr[j];
            		 arr[j]=temp;
           }
        		 
             }
         }
		
		return arr;
	}
}
