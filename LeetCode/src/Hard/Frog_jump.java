package Hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//leetcode 403
public class Frog_jump {

	public boolean canCross(int[] stones) {
		
		// rule is first jump is always 1 units
		if (stones[1]- stones[0]!= 1) return false;
		
		
		Map<Integer, Set<Integer>> dp = new HashMap<>();
		for (int stone : stones) {
			dp.put(stone, new HashSet<>());
		}

		// The first stone has a jump size of 0
		dp.get(0).add(0);

		for (int stone : stones) {
			for (int jump : dp.get(stone)) {
				for (int step = jump - 1; step <= jump + 1; step++) {
					if (step > 0 && dp.containsKey(stone + step)) {
						dp.get(stone + step).add(step);
					}
				}
			}
		}

		// Check if the last stone has any valid jumps
		return !dp.get(stones[stones.length - 1]).isEmpty();
	}

	public static void main(String[] args) {
		Frog_jump obj = new Frog_jump();
		int[] stones = { 0, 1, 3, 5, 6, 8, 12, 17 };
		System.out.println(obj.canCross(stones)); // Output: true
	}
}
