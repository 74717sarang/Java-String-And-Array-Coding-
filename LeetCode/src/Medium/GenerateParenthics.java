package Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthics {

	public List<String> generateParenthesis(int n) {

		List<String>result=new ArrayList<>();
		
		generate(result,"",0,0,n);		
		return result;
	}
	
	  
	

	private void generate(List<String> result, String string, int open, int close, int n) {
		
		if(string.length()==n*2) {
			result.add(string);
			return  ;
		}
		if(open<n) {
			generate(result,string+"(", open+1, close, n);
		}
		
		if(close<open) {
			generate(result, string+")", open, close+1, n);
		}
	}	
	


	public static void main(String[] args) {

		GenerateParenthics solution = new GenerateParenthics();

		// Example 1
		int n1 = 3;
		System.out.println(solution.generateParenthesis(n1)); // Output: ["((()))","(()())","(())()","()(())","()()()"]

		// Example 2
		int n2 = 1;
		System.out.println(solution.generateParenthesis(n2)); // Output: ["()"]
	}

}
