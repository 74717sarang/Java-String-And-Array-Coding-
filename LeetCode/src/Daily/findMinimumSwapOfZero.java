package Daily;

public class findMinimumSwapOfZero {

	
	 public static long minimumSteps(String s) {
	        //this good but TEL comes for last test case
//	          long count =0;
//	          for(int i=0;i<s.length()-1;i++){
//	             for(int j=i+1;j<s.length();j++){
//	                 if(s.charAt(j)=='0' && s.charAt(i)=='1'){
//	                     count++;
//	                 }
//	             }
//	          }
//		 return count;
	        long count = 0;
	        long zeroCount = 0;
	        for (int i = s.length() - 1; i >= 0; i--) {
	            if (s.charAt(i) == '0') {
	                zeroCount++; 
	            } else if (s.charAt(i) == '1') {
	                count += zeroCount; 
	            }
	        }
	 return count;
	 }
	
	
	public static void main(String[] args) {
	
		findMinimumSwapOfZero sol = new findMinimumSwapOfZero();
        String s = "101010";
        System.out.println(sol.minimumSteps(s));  // Output: 6
	
	
//                Input: s = "101"
//        		Output: 1
//        		Explanation: We can group all the black balls to the right in the following way:
//        		- Swap s[0] and s[1], s = "011".
//        		Initially, 1s are not grouped together, requiring at least 1 step to group them to the right.
	
        String s1 = "101";
        System.out.println(sol.minimumSteps(s1));  // Output: 1
        
        
//             Input: s = "100"
//        		Output: 2
//        		Explanation: We can group all the black balls to the right in the following way:
//        		- Swap s[0] and s[1], s = "010".
//        		- Swap s[1] and s[2], s = "001".
//        		It can be proven that the minimum number of steps needed is 2. 
        
        String s2 = "100";
        System.out.println(sol.minimumSteps(s2));  // Output: 2
        
	}
}
