package Daily;

import java.util.Arrays;

public class Divide_Array_Sum_equal {

	// 2491. Divide Players Into Teams of Equal Skill

	private long dividePlayers(int[] skill) {

		Arrays.sort(skill);
		int add = skill[0] + skill[skill.length - 1];
		long sum = 0;

		for (int i = 0; i < skill.length / 2; i++) {

			if (skill[i] + skill[skill.length - 1 - i] != add) {
				return -1;
			}
			sum += skill[i] * skill[skill.length - 1 - i];
		}

		return sum;
	}

	public static void main(String[] args) {

		Divide_Array_Sum_equal solution = new Divide_Array_Sum_equal();

		int[] skill1 = { 3, 2, 5, 1, 3, 4 };
		System.out.println(solution.dividePlayers(skill1)); // Output: 22

		// Example 2
		int[] skill2 = { 3, 4 };
		System.out.println(solution.dividePlayers(skill2)); // Output: 12

		// Example 3
		int[] skill3 = { 1, 1, 2, 3 };
		System.out.println(solution.dividePlayers(skill3)); // Output: -1

	}

}
