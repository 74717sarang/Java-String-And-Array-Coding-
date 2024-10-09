package Daily;

public class SwapBraket{
public static int minSwaps(String s) {
    //       int swap=0;

	int imbalance = 0; 
    int maxImbalance = 0;  

    //   if(s.length()==0 || s.equals("[]")){
    //     return 0;
    //   }
    

    for (char c : s.toCharArray()) {
        if (c == '[') {
            imbalance--;  
            }
             else {
            imbalance++;  
        }
        maxImbalance = Math.max(maxImbalance, imbalance);
    }

    return (maxImbalance + 1) / 2;
}
	
	
	public static void main(String[] args) {
		

//		char c1='[';
//		char c2=']';
//		int c=c2;
//		System.out.printf("%d ",c);
		
    		
	}
	
}
