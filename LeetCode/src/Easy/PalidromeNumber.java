package Easy;

public class PalidromeNumber {

	public static  boolean isPalindrome(int x) {

        // all ok but not efficient
        // String str=String.valueOf(x);
        // str=new StringBuilder(str).reverse().toString();
        // return str.equals(String.valueOf(x));


         // all ok but not efficient  
    //       String str=String.valueOf(x);
    //    for(int i=0;i<str.length()/2;i++){
    //        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
    //        return false ;
    //        }
    //    }
    //     return true;


        int no = x;
        int Revno = 0;
        while (no > 0) {
            int rem = no % 10;
            Revno = Revno * 10 + rem;
            no /= 10;

        }
        return Revno == x;
    }
	
	public static void main(String[] args) {

		
		int no=123321;
		System.out.println(isPalindrome(no));
	}

}
