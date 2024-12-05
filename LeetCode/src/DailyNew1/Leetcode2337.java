package DailyNew1;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2337 {


	public static boolean canChange(String start, String target) {
        if (!start.replace("_", "").equals(target.replace("_", "")))
            return false;
        int i = 0, j = 0, n = start.length();
        while (i < n && j < n) {
            while (i < n && start.charAt(i) == '_')
                i++;
            while (j < n && target.charAt(j) == '_')
                j++;
            if (i < n && j < n) {
                if (start.charAt(i) != target.charAt(j))
                    return false;
                if (start.charAt(i) == 'L' && i < j)
                    return false;
                if (start.charAt(i) == 'R' && i > j)
                    return false;
                i++;
                j++;
            }
        }
        return true;
    }
	
	public static boolean canChange2(String start, String target) {
		
		List<Integer> startL = new ArrayList<>();
	    List<Integer> startR = new ArrayList<>();
	    List<Integer> targetL = new ArrayList<>();
	    List<Integer> targetR = new ArrayList<>();
	    
	    // Collect indices of 'L' and 'R' from start and target
		for (int i = 0; i < start.length(); i++) {
	        char sChar = start.charAt(i);
	        char tChar = target.charAt(i);
	        if (sChar == 'L') startL.add(i);
	        if (sChar == 'R') startR.add(i);
	        if (tChar == 'L') targetL.add(i);
	        if (tChar == 'R') targetR.add(i);
	    }
	    
	    // Check if counts of 'L' and 'R' match
	    if (startL.size() != targetL.size() || startR.size() != targetR.size()) return false;
	    
	    // Check if 'L' and 'R' movements are valid
	    for (int i = 0; i < startL.size(); i++) {
	        if (startL.get(i) < targetL.get(i)) return false; // 'L' can't move right
	    }
	    for (int i = 0; i < startR.size(); i++) {
	        if (startR.get(i) > targetR.get(i)) return false; // 'R' can't move left
	    }
		return true;
	}

	
	
	public static void main(String[] args) {

		
		String start = "_L__R__R_"; 
		String target = "L______RR";
		System.out.println(canChange(start, target));
		System.out.println(canChange2(start, target));

	}

}
