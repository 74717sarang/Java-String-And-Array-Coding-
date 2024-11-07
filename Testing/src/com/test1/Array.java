package com.test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Array {

	 public static int findPrime(int array_length, List<Integer> arr) {
	        for (int i = 0; i < array_length; i++) {
	            int num = arr.get(i);
	            if (isPrime(num)) { // Check if the current number is prime
	                if (canBeWrittenAsSum(num, arr)) { // Check if it can be written as a sum
	                    return i; // Return the index of the first special prime found
	                }
	            }
	        }
	        return -1; // Return -1 if no special prime is found
	    }

	    // Helper function to check if a number is prime
	    private static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }

	    // Helper function to check if a number can be written as the sum of two elements in the array
	    private static boolean canBeWrittenAsSum(int target, List<Integer> arr) {
	        Set<Integer> seen = new HashSet<>();
	        for (int num : arr) {
	            int complement = target - num;
	            // Check if the complement is in the set and allows a+b=target condition
	            if (seen.contains(complement)) {
	                return true;
	            }
	            seen.add(num);
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int array_length = Integer.parseInt(scan.nextLine().trim());
	        List<Integer> arr = new ArrayList<>(array_length);
	        for (int j = 0; j < array_length; j++) {
	            arr.add(Integer.parseInt(scan.nextLine().trim()));
	        }

	        int result = findPrime(array_length, arr);
	        System.out.println(result);
	    }
	    
	    
}
