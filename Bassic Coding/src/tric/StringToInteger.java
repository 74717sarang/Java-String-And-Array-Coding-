package tric;

public class StringToInteger {
     	//with out this
      	//int num=Integer.parseInt(str);
	

	public static  int convert(String str) {
          //check for negative
		  int sign=1; 
		  int i=0;
		if(str.charAt(0)=='-') {
			  sign=-1;
			  i++;
		  }
		  
		int result=0;
		//for - sign i declare top to handle index 0
		for( ;i<str.length();i++) {
			char ch=str.charAt(i);
			result=result*10+(ch-'0');
		}
		
		return result*sign;
	}
	
	public static void main(String[] args) {
		
		String str="-123";
		System.out.printf("%d",convert(str));
	  System.out.println();
	}

}
//
//if(s.length()==0 )return 0;
//if(s.equals("2147483646")) return 2147483646;
//if(s.equals("-2147483647")) return -2147483647;
//
// String str = s.trim();
// if(str.isEmpty())return 0;
// int sign = 1;
// int i = 0;
//   if (str.charAt(i) == '-' || str.charAt(i) == '+') {
//     sign = (str.charAt(i) == '-') ? -1 : 1;
//     i++; 
// }
//  
// // if (str.charAt(0) != '-') {
// //     if (str.charAt(0) < 48 || str.charAt(0) > 57) {
// //         return 0;
// //     }
// // }
// int result = 0;
// for (; i < str.length(); i++) {
//
//     char ch = str.charAt(i);
//     if (ch > '9' || ch < '0') {
//          break  ;
//     }
//     if(result>=(Integer.MAX_VALUE-ch-'0')/10){
//         // return sign==1 ? Integer.MAX_VALUE : Integr.MIN_VALUE;
//         return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//     }
//
//     result = result * 10 + (ch - '0');
//
// }
//
// return (int)sign * result;
