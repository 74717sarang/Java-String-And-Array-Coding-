package DailyNew1;

import java.util.PriorityQueue;

public class Leetcode2558 {

	
	 public static long pickGifts(int[] gifts, int k) {
	       PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
	        for (int gift : gifts) {
	            maxHeap.add(gift);
	        }

	        while (k-- > 0) {
	            int richestPile = maxHeap.poll();
	            int remainingGifts = (int) Math.sqrt(richestPile);
	            maxHeap.add(remainingGifts);
	        }

	        long totalGifts = 0;
	        for (int gift : maxHeap) {
	            totalGifts += gift;
	        }

	        return totalGifts;

	    }
	
	public static void main(String[] args) {
		
		int[] gifts = {25,64,9,4,100};
		int k = 4;
		System.out.println(pickGifts(gifts, k));
	}
}
