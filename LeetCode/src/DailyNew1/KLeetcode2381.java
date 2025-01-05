package DailyNew1;

public class KLeetcode2381 {

	    public static  String shiftingLetters(String s, int[][] shifts) {
	        int n = s.length();
	        int[] shiftArray = new int[n + 1];
	        
	        // Apply the shifts
	        for (int[] shift : shifts) {
	            int start = shift[0];
	            int end = shift[1];
	            int direction = shift[2];
	            shiftArray[start] += (direction == 1) ? 1 : -1;
	            shiftArray[end + 1] += (direction == 1) ? -1 : 1;
	        }
	        
	        // Accumulate the shifts
	        int cumulativeShift = 0;
	        char[] result = s.toCharArray();
	        for (int i = 0; i < n; i++) {
	            cumulativeShift += shiftArray[i];
	            cumulativeShift = (cumulativeShift % 26 + 26) % 26; // Normalize
	            result[i] = (char) ('a' + (result[i] - 'a' + cumulativeShift) % 26);
	        }
	        
	        return new String(result);
	    }
	    
	        public static void main(String[] args) {
	            String s = "abc";
	            int[][] shifts = {{0, 1, 1}, {1, 2, 0}};
	            System.out.println(shiftingLetters(s, shifts)); // Example output: "bcd"
	        }
	    

	
}
