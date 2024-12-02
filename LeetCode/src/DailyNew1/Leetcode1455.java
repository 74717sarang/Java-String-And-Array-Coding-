package DailyNew1;

public class Leetcode1455 {

	public int isPrefixOfWord(String sentence, String searchWord) {

        String[] arr = sentence.split("\\s+");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

	
	public static void main(String[] args) {

//		Input: sentence = "i love eating burger", searchWord = "burg"
//		Output: 4
//		Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
		 
	
		String sentence = "i love eating burger";
		String searchWord = "burg";
		
		Leetcode1455 leetcode1455=new  Leetcode1455();
		System.out.println(leetcode1455.isPrefixOfWord(sentence, searchWord));
		
	}
}
