package DailyNew1;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode2182 {

	public String repeatLimitedString(String s, int repeatLimit) {
		// Count frequency of characters
		int[] freq = new int[26];
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}

		// Max-heap to keep characters in lexicographically largest order
		PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
		for(int i = 25; i >= 0; i--) {
			if (freq[i] > 0) {
				maxHeap.offer(new int[] { i, freq[i] });
			}
		}

		StringBuilder result = new StringBuilder();
		while (!maxHeap.isEmpty()) {
			int[] current = maxHeap.poll();
			int charIdx = current[0];
			int charCount = current[1];

			// Append the current character up to repeatLimit times
			int appendCount = Math.min(repeatLimit, charCount);
			for (int i = 0; i < appendCount; i++) {
				result.append((char) ('a' + charIdx));
			}

			// If more characters remain, add back to the heap
			if (charCount > appendCount) {
				if (!maxHeap.isEmpty()) {
					int[] next = maxHeap.poll();
					result.append((char) ('a' + next[0])); // Add a "break" character
					next[1]--;
					if (next[1] > 0) {
						maxHeap.offer(next);
					}
					maxHeap.offer(new int[] { charIdx, charCount - appendCount });
				} else {
					break; // No other character to break the sequence
				}
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		
		
		String s="abcabc";
		Map<Character, Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++){
//			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer>m:map.entrySet()) {
			System.out.println(m.getKey()+"="+m.getValue() );
		}
	}
}
