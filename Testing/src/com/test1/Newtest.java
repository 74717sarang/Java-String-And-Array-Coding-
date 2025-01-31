package com.test1;

public class Newtest {

	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
	        
	        int N =10; // Total number of paracetamol tablets
	        int M = 12; // Total number of antibiotics
	        int X = 2; // Paracetamol required per patient
	        int Y =5; // Antibiotics required per patient

	        int count = 1;

	        // Try serving patients greedily while supplies last
	        while (N >= X && M >= Y) {
	            N -= X; // Deduct paracetamol
	            M -= Y; // Deduct antibiotics
	            ++count; // Increase patient count
	        }

	        System.out.println(count);
	    }
	
}
