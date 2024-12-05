package leetcode75challenge;

public class Leetcode1456 {

	public static int maxVowels(String s, int k) {
	      
	      // work for 100/107 testb case TLE
	    //     int count=0;
	    //     String vowels="aeiou";
	    //    char arr[]=s.toCharArray();
	    //     int maxCount=0;
	    //     for(int i=0;i<=arr.length-k;i++){
	    //         count=0;
	    //         for(int j=i;j<k+i;j++){
	    //             if(vowels.contains(String.valueOf(arr[j]))){
	    //          count++;
	    //            }
	    //         }
	    //          maxCount=Math.max(count,maxCount);
	    //     }
	    //     return maxCount;
	 
	       int count=0;
	       int maxCount=0;
	     String vowels="aeiou";
	    
	       for(int i=0;i<k;i++){
	        if(vowels.indexOf(s.charAt(i))!=-1)
	          {
	             count++;
	          }
	       }
	    maxCount=count;

	    for(int i=k;i<s.length();i++){
	        if(vowels.indexOf(s.charAt(i))!=-1)
	          {
	             count++;
	          }
	        if(vowels.indexOf(s.charAt(i-k))!=-1){
	            count--;
	        }
	        maxCount=Math.max(maxCount,count);
	    }
	      return maxCount;
	    }
	
	
	
	public static void main(String[] args) {
//		Input: s = "abciiidef", k = 3
//		Output: 3
//		Explanation: The substring "iii" contains 3 vowel letters
		
		
		String s = "abciiidef";
		int k = 3;
		
		System.out.println(maxVowels(s, k));  // output=3
	}

}
