package DailyNew1;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode2185 {

	public static int prefixCount(String[] words, String pref) {
        int count =0;
        for(String s:words){
            if(s.startsWith(pref)){
                count++;
            }
        }
    return count;
    }
	
	
	public static int prefixCountNew(String[] words, String pref) {
		
//		return (int) new ArrayList<String>(Arrays.asList(words))
//				.stream()
//				.filter(a->a.startsWith(pref))
//				.count();
				
		return (int) Arrays.stream(words)
		        .filter(a -> a.startsWith(pref))
		        .count();
	}

	public static void main(String[] args) {

//		Input: words = ["pay","attention","practice","attend"], pref = "at"
//				Output: 2
		
		String[]words = {"pay","attention","practice","attend"};
		 String pref = "at";
		 System.out.println(prefixCount(words, pref) );
		 System.out.println(prefixCountNew(words, pref) );
		
	}

}
