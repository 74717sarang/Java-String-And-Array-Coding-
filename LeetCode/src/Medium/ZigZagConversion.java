package Medium;

public class ZigZagConversion {
// leetcode 6
	
	
	    public String convert(String s, int numRows) {
	        if (numRows == 1 || numRows >= s.length()) {
	            return s;
	        }

	        StringBuilder[] rows = new StringBuilder[numRows];
	        for (int i = 0; i < numRows; i++) {
	            rows[i] = new StringBuilder();
	        }

	        int direction = 1;  // 1 for moving down, -1 for moving up
	        int currentRow = 0;

	        for (char c : s.toCharArray()) {
	            rows[currentRow].append(c);

	            if (currentRow == 0) {
	                direction = 1;  // Change direction to down
	            } else if (currentRow == numRows - 1) {
	                direction = -1;  // Change direction to up
	            }

	            currentRow += direction;
	        }

	        StringBuilder result = new StringBuilder();
	        for (StringBuilder row : rows) {
	            result.append(row);
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	    	ZigZagConversion solution = new ZigZagConversion();
	        String s1 = "PAYPALISHIRING";
	        int numRows1 = 3;
	        System.out.println("Output for numRows = 3: " + solution.convert(s1, numRows1));  
	        // Output: "PAHNAPLSIIGYIR"

	        String s2 = "PAYPALISHIRING";
	        int numRows2 = 4;
	        System.out.println("Output for numRows = 4: " + solution.convert(s2, numRows2));  
	        // Output: "PINALSIGYAHRPI"
	    }
	}



