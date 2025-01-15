package co.string;

public class Palidrome {

	private static boolean isPalidrome(String str) {

		
		
		
		
		
		// best efficient
		int left=0;
		int right=str.length()-1;
		while(left < right) {
			
			if(str.charAt(left)!=str.charAt(right)) {
				return false; 
			}
			left++;
			right--;
		}
		
		return true;
	}
	//
	private static boolean methodPAlidrome(String str) {    
		String str1=new StringBuilder(str).reverse().toString();
		return str.equals(str1);
	}

	
	private static boolean functionPAlidrome(String str) {
       String s="";
       for(int i=str.length()-1;i>=0;i--) {
    	   s+=str.charAt(i);
       }
		
		return str.equals(s);
	}
	
	
	// for integer
	private static boolean functionIntegerPAlidrome(int num) {
          int rem=0;
          int rev=0;
          int no=num;
		  while(no!=0) {
			  rem=no%10;
			  rev=rev*10+rem;
			  no/=10;
		  }
		return num==rev;
	}
	private static boolean check(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false; 
				
			}
		}
		
		return true;
	}

	
	
	public static void main(String[] args) {
		
		String str="abccba";
		int num=123321;
		System.out.println("Using check methode::"+isPalidrome(str));

		System.out.println(isPalidrome(str));
		System.out.println(methodPAlidrome(str));
		System.out.println(functionPAlidrome(str));
		System.out.println("is NUM::"+functionIntegerPAlidrome(num));

	}
	

	

	
}
