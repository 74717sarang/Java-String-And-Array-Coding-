package leetcode75challenge.array_string;

public class MergedString {

	
	public static 
	String mergeAlternately(String word1, String word2) {
	   
		//with for loop
		
		//   StringBuilder str=new StringBuilder();
	    //    int len=word1.length()+word2.length();
	    //     for(int i=0;i<len;i++){
	    //         if(i<word1.length()){
	    //            str.append(word1.charAt(i));
	    //         }
	    //         if(i<word2.length()){
	    //            str.append(word2.charAt(i));
	    //         }
	    //     }
	    //     return str.toString();


		
		//with while loop
//	      StringBuilder str=new StringBuilder();
//	      int i=0;
//	      while(i<word1.length() || i<word2.length()){
//	            if(i<word1.length()){
//	                str.append(word1.charAt(i));
//	            }
//	            if(i<word2.length()){
//	               str.append(word2.charAt(i));
//	            }
//	            i++;
//
//	      }
//	       return str.toString();
		
		// Use two pointers to iterate 
		 StringBuilder str=new StringBuilder();
	      int i=0;int j=0;

	    
	        while (i < word1.length() && j < word2.length()) {
	            str.append(word1.charAt(i++)); // Add character from word1 and increment i
	            str.append(word2.charAt(j++)); // Add character from word2 and increment j
	        }

	        while (i < word1.length()) {
	            str.append(word1.charAt(i++));
	        }

	        while (j < word2.length()) {
	            str.append(word2.charAt(j++));
	        }


	return str.toString();
	    }
	
	public static void main(String[] args) {

		 String word1 = "abc";
	        String word2 = "pqr";
	        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcr"

	        word1 = "ab";
	        word2 = "pqrs";
	        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqrs"

	        word1 = "abcd";
	        word2 = "pq";
	        System.out.println(mergeAlternately(word1, word2)); // Output: "apbqcd"
	}

}
