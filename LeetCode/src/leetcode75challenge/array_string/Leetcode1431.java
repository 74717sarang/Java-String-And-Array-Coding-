package leetcode75challenge.array_string;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {

	
	
	public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : candies) {
            if (i + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;

    }
	
	
	public static void main(String[] args) {

//		Input:
			int[]candies = {2,3,5,1,3};
		int extraCandies = 3;
		List<Boolean> result =kidsWithCandies(candies, extraCandies);
		  result.forEach(i->System.out.println(i));
		System.out.println();
	
	
	}

}
