package DailyNew1;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2182 {



	
	
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
		map.replace(null, null)
	}
}
