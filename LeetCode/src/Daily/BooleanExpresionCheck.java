package Daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BooleanExpresionCheck {

	public static boolean parseBoolExpr(String expression) {
        char[]arr=expression.toCharArray();
           Stack<Character>stack=new Stack<>();

         for(char c:arr){

            if(c==')'){
                List<Character>list=new ArrayList<>();
                while(stack.peek()!='('){
                    list.add(stack.pop());
                }
                stack.pop();
                char op=stack.pop();
             if(op=='!'){
              stack.push(list.get(0)=='t' ? 'f': 't');
             }
             else if(op=='&'){
                 stack.push(list.stream().allMatch(a->a=='t') ? 't' : 'f');
             }
             else  if(op=='|'){
               stack.push(list.stream().anyMatch(a->a=='t') ? 't' : 'f')  ;    
             }
            


              }
            else if(c!=','){
                stack.push(c);
            }
         }     
     return stack.pop()=='t';
    }
	
	
	public static void main(String[] args) {
//		
//		String str="abcd";
//		System.out.println(str.contains("a"));

		 // Test cases
	    System.out.println(parseBoolExpr("!(f)"));          // Output: true
	    System.out.println(parseBoolExpr("|(f,t)"));        // Output: true
	    System.out.println(parseBoolExpr("&(t,f)"));        // Output: false
	    System.out.println(parseBoolExpr("|(&(t,f,t),!(t))")); // Output: false
	
	}
}
