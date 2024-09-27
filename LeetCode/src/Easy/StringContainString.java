package Easy;

public class StringContainString {

	
	
	
	    public static int strStr(String haystack, String needle) {
	  
	       String regx="["+needle+"]";
	          if(haystack.contains(needle)){
	            return haystack.indexOf(needle);
	          }
	   return -1;

	    }
	
	
	public static void main(String[] args) {

		String haystack="leetcode";
		String needle="tco";
		System.out.println(strStr(haystack, needle) );
	}

}
