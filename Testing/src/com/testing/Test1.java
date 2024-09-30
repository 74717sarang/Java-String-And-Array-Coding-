package com.testing;

public class Test1 {

	 int x;
	 int y;
	 public Test1(int a) {
		 x=a;
		 y=a;
	 }
	public  void display() {
		System.out.println(x+" "+y);
	}
	
	public static void main(String[] args) {

		Test1 test1=new Test1(10);
		 test1.display();
		
	}

}
