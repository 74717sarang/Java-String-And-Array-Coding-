package com.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeNoArray {

	private static int findPrime(int array_length, List<Integer> arr) {

		for (int i = 0; i < array_length; i++) {
			if (isPrime(arr.get(i))) {
				System.out.println("prime");
				Set<Integer> seen = new HashSet<>();
				for (int num : arr) {
					int complement = arr.get(i) - num;
					// Check if the complement is in the set and allows a+b=target condition
					if (seen.contains(complement)) {
						return i;
					}
					seen.add(num);
				}

			}

		}
		return -1;

	}

	

	public static boolean isPrime(int num) {
	    if (num <= 1) return false; // 0 and 1 are not prime numbers
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) {
	            return false; // Not a prime number if divisible by any i
	        }
	    }
	    return true; // Prime if no divisors found
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner(System.in);
//        int array_length = Integer.parseInt(scan.nextLine().trim());
		List<Integer> arr = new ArrayList<>();

//        for (int j = 0; j < array_length; j++) {
//            arr.add(Integer.parseInt(scan.nextLine().trim()));
//        }
		arr.add(6);
		arr.add(59);
		arr.add(35);
		arr.add(53);
		arr.add(53);
		arr.add(97);
		arr.add(17);
		arr.add(7);

		int result = findPrime(arr.size(), arr);
//		System.out.println(arr.size());
		System.out.println(result);
	}

}
