package com.testing;


public class Test3 {

	public int add(int a, int b) {
		return a + b;
		}
//
//	public int add(int a, int b, int c) {
//		return a + b + c;
//	}
//    
//	public double add(double a, int b, int c) {
//		return a + b + c;
//	}
	 
      // we can write boolean fun as same name
	public boolean add(boolean f) {
		boolean flag=f;
		return flag;
	}


	public static void main(String[] args) {
		Test3 test3=new Test3();
		System.out.println(test3.add(true));
		System.out.println(test3.add(1,2));
//		System.out.println(test3.add(1.0,2,3));
//		System.out.println(test3.add(1,2,3));
		
		System.out.println();
	}
}
