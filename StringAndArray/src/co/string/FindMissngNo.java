package co.string;

public class FindMissngNo {

	public static void main(String[] args) {
		
		int[]number=new int[] {1,2,3,4,6,7,8};
		  
		int LNo = number[number.length - 1];
		System.out.println(LNo);
		 int aTotal=(LNo*(LNo+1)/2);
		
		int gtotal=0;
		for(int i:number) {
			gtotal+=i;
		}
		System.out.println("givenTotal::"+gtotal);
		System.out.println("Missing Noa::"+(aTotal-gtotal));
	}
	
	
}
