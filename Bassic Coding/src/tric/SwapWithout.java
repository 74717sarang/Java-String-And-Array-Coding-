package tric;

public class SwapWithout {

	public static void main(String[] args) {
		
		int a=5,b=10;
		a=a^b;//a^b
		b=a^b;//(a^b)^b
		a=a^b;// (a^b)^(a^b
	
		// or this
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		// with temp as third variable
//		int temp=a;
//		      a=b;
//		      b=temp;
			
		
		System.out.println("a::"+a+" b::"+b);
	} 
}
