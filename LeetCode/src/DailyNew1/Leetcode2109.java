package DailyNew1;

public class Leetcode2109 {

	// adding space at given index
	 public static String addSpaces(String s, int[] spaces) {
	        StringBuilder str=new StringBuilder();
	         int j=0;
	        for(int i=0;i<s.length();i++){
	             if(j<spaces.length && i==spaces[j]){
	              str.append(" ");
	              j++;
	             }
	          str.append(s.charAt(i));
	        }
	    return str.toString();
	    }
	 
	
	public static void main(String[] args) {
		
//		Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
//		Output: "Leetcode Helps Me Learn"
		
		String str="LeetcodeHelpsMeLearn";  
		int spaces[]= {8,13,15};
		System.out.println(addSpaces(str, spaces));
	}
}
