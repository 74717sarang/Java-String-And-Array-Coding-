package Daily;

public class MaximunSwap670 {

	public static int maximumSwap(int num) {
        String str = Integer.toString(num);
        char[] arr = str.toCharArray();
        
        // Create an array to store the last occurrence of each digit
        int[] last = new int[10];  // Array to hold the last index of digits 0-9
        
        // Fill the last occurrence of each digit
        for (int i = 0; i < arr.length; i++) {
            last[arr[i] - '0'] = i;
        }
        
        // Find the first digit that can be swapped to maximize the number
        for (int i = 0; i < arr.length; i++) {
            // Check for a higher digit that occurs later
            for (int d = 9; d > arr[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap current digit with the higher one found
                    char temp = arr[i];
                    arr[i] = arr[last[d]];
                    arr[last[d]] = temp;
                    
                    // Convert the array back to an integer and return
                    return Integer.parseInt(new String(arr));
                }
            }
        }
        
        // If no swap can make the number larger, return the original number
        return num;
    }
	
	
	
	public static void main(String[] args) {
		
		int num=2736;
		System.out.println(maximumSwap(num));
		
		
//		String str=Integer.toString(num);
//		int []arr=new int[str.length()];
//		int i=0;
//		while(num!=0) {
//			  
//			  arr[i]=num%10;
//			  num/=10;
//		System.out.println(arr[i]);	
//		i++;
////
////		  }
//		for(int i=0;i<str.length();i++) {
//			arr[i]=str.charAt(i)-'0';
//		}
//		
//		System.out.println();
//	     for(int i:arr) {
//	            System.out.print(i+" ");
//		    }
//		
//	     int max=0;
//		for(int i=0;i<arr.length;i++) {
//			max=Math.max(max, arr[i]);
//		}
//		System.out.println("max::"+max);
//		
//		for(int i=0;i<arr.length;i++) {
//          if(max==arr[i]) {
//        	 int temp=arr[i];
//     	     arr[i]=arr[0];
//     	     arr[0]=temp; 
//          }
//		}
//		System.out.println("After");
//	     for(int i:arr) {
//	            System.out.print(i+" ");
//		    }
//		 StringBuilder s=new StringBuilder();
//		    for(int i:arr) {
//	            s.append(i);
//		    }
//		    System.out.println();
//	     System.out.println("Last"+Integer.parseInt(s.reverse().toString()));
		
		
		
		
		
		
//        Arrays.sort(arr);
//        for(int i:arr) {
//            System.out.print(i+" ");
//	    }
//	     int temp=arr[arr.length-1];
//	     arr[arr.length-1]=arr[0];
//	     arr[0]=temp;
//  
//	     System.out.println();
//	     for(int i:arr) {
//	            System.out.print(i+" ");
//		    }
	}
}
