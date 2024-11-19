package Daily;

public class Leetcode1652 {
	
	
	private static int[] decrypt(int[] code, int k) {
          
		if(k==0)
		{
		  return code =new int[code.length];
		}
		int directon= k > 0 ? 1 : -1;
		
		 k=Math.abs(k);
		
		for(int i=0;i<code.length;i++) {
			int sum=0;
			for(int j=1;j<=k;j++) {
				int index=(i+j*code.length+code.length)%code.length;
				sum+=code[index];
			}
			code[i]=sum;
		}
		
		
		return code;
	}
	
	 public static void main(String[] args) {
	        int[] code = {5, 7, 1, 4};
	        int k = 3;

	        int[] decrypted = decrypt(code, k);
	        for (int num : decrypted) {
	            System.out.print(num + " ");
	        }
   }
}

	
