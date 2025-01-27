package DailyNew1;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1462 {

	public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
		// Create a matrix to store reachability
		boolean[][] reachable = new boolean[numCourses][numCourses];

		// Populate the matrix with direct prerequisites
		for (int[] pre : prerequisites) {
			reachable[pre[0]][pre[1]] = true;
		}

		// Use Floyd-Warshall to compute transitive closure
		for (int k = 0; k < numCourses; k++) {
			for (int i = 0; i < numCourses; i++) {
				for (int j = 0; j < numCourses; j++) {
					if (reachable[i][k] && reachable[k][j]) {
						reachable[i][j] = true;
					}
				}
			}
		}

		// Answer the queries based on the reachability matrix
		List<Boolean> result = new ArrayList<>();
		for (int[] query : queries) {
			result.add(reachable[query[0]][query[1]]);
		}

		return result;
	}

	public static void main(String[] args) {
		Leetcode1462 solution = new Leetcode1462();
		int numCourses = 4;
		int[][] prerequisites = { { 0, 1 }, { 1, 2 }, { 2, 3 } };
		int[][] queries = { { 0, 3 }, { 3, 0 }, { 1, 3 }, { 3, 1 } };
		System.out.println(solution.checkIfPrerequisite(numCourses, prerequisites, queries));
		// Output: [true, false, true, false]
	}

}
