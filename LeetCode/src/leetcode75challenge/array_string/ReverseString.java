package leetcode75challenge.array_string;

public class ReverseString {

	
	public String reverseWords(String s) {
        String[]str=s.split("\\s+");// handle extra space 
                      // "\\s+" => one or more space 
        String result="";
        for(int i=str.length-1;i>=0;i--){
            if(!(str[i].equals(" "))){
            result+=str[i];
             result+=" ";
        }
        }  
        return result.trim();
    }
	public static void main(String[] args) {

//		Input: s = "the sky is blue"
//		Output: "blue is sky the"
		
		ReverseString reverseString=new ReverseString();
		
		String s = "the sky is blue";
		
		System.out.println("Reverse::"+reverseString.reverseWords(s));
		
//		Input: s = "a good   example"
//		Output: "example good a"
//		Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
	}

}
