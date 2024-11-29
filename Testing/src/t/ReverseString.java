package t;

import java.util.Arrays;

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

        int[][] nestedNums = {{0, 1}, {0, 3, 12}};
		int[] nums = { 3, 12,10, 21, 80,  };

        System.out.println(Arrays.deepToString(nestedNums));
		
        System.out.println(Arrays.deepToString(new Object[] {nums}));

	}

}
