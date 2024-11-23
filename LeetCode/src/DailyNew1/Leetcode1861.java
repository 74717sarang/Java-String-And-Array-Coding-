package DailyNew1;

public class Leetcode1861 {

	
	public static  char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        char[][] result = new char[n][m];
        
        // Move stones to the right in the box
        for (int i = 0; i < m; i++) {
            int empty = n - 1; // Start from the last column
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    empty = j - 1; // Update empty position to before obstacle
                } else if (box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][empty] = '#';
                    empty--; // Update empty position
                }
            }
        }
        
        // Rotate the box 90 degrees clockwise
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = box[i][j];
            }
        }
        
        return result;
    }
	public static void main(String[] args) {
		
         
	}

}
