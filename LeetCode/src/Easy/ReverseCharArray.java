package Easy;

public class ReverseCharArray {

//	ReverseCharArray without extra space
	
	public void reverseString(char[] s) {
        
		// int j=s.length-1;
        // int i=0;
        // while(i<j){
        //     char temp=s[i];
        //     s[i]=s[j];
        //     s[j]=temp;
        //     i++;
        //     j--;
        // }

     
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
        return ;
    }
	
	
	
	public static void main(String[] args) {
//		Input: s = ["h","e","l","l","o"]
//		Output: ["o","l","l","e","h"]
	}
}
