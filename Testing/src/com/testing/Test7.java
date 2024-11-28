package com.testing;

public class Test7 implements inertfaceA, inertfaceB {

	// if two methode in two diff interface is same then it
	// will same (one) in imlementing class 
	// we can not write a two metheod have same name in one class
	public static void main(String[] args) {

		Test7 test1 = new Test7();
		test1.display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

}
