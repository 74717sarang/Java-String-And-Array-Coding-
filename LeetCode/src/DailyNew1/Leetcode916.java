package DailyNew1;

import java.util.ArrayList;
import java.util.List;

public class Leetcode916 {


	    public List<String> wordSubsets(String[] words1, String[] words2) {
	        int[] maxFreq = new int[26];

	        // Calculate the maximum frequency of each letter needed in all b words
	        for (String b : words2) {
	            int[] freq = countFrequency(b);
	            for (int i = 0; i < 26; i++) {
	                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
	            }
	        }

	        List<String> result = new ArrayList<>();
	        for (String a : words1) {
	            int[] freq = countFrequency(a);
	            boolean isUniversal = true;
	            for (int i = 0; i < 26; i++) {
	                if (freq[i] < maxFreq[i]) {
	                    isUniversal = false;
	                    break;
	                }
	            }
	            if (isUniversal) {
	                result.add(a);
	            }
	        }

	        return result;
	    }

	    private int[] countFrequency(String word) {
	        int[] freq = new int[26];
	        for (char c : word.toCharArray()) {
	            freq[c - 'a']++;
	        }
	        return freq;
	    }

	    public static void main(String[] args) {
	    	Leetcode916 ws = new Leetcode916();
	        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
	        String[] words2 = {"e", "oo"};
	        System.out.println(ws.wordSubsets(words1, words2)); 
	        // Output: [facebook, google]
	    }
	

}
