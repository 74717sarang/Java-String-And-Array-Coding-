package com.star;


public class FloydS_Triangle {
	
	
     
	public static void main(String[] args) {
     /*
      * 1
      * 23
      * 456
      * 78910
      * */

	  int row=4;
		int num=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
			
		}
		
		System.out.println(); 
		
	}

}
