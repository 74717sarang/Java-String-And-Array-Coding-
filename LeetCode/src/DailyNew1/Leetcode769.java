package DailyNew1;

public class Leetcode769 {

	public static  int maxChunksToSorted(int[] arr) {
        int max = 0, chunks = 0;
    for (int i = 0; i < arr.length; i++) {
        max = Math.max(max, arr[i]);
        if (max == i) {
            chunks++;
        }
    }
    return chunks;
    }
	
	public static void main(String[] args) {
//		Input: arr = [4,3,2,1,0]
//				Output: 1
		
		
		int[]arr = {4,3,2,1,0};
		System.out.println(maxChunksToSorted(arr));
	}
}
