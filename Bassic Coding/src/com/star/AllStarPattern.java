package com.star;

public class AllStarPattern {

	public static void main(String[] args) {
		/*
			
		  *
		  **
		  *** 
		  ****
		  *****
		  
		 */
		int row = 5;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("-------------");

		for (int k = row; k > 0; k--) {
			for (int j = 0; j < k; j++) {
				System.out.print(" * ");
			}
			System.out.println();

		}
		System.out.println("-------------");
		/*
		 
	    *
	    ***
		*****
		*******
		*********
		  
		  
		 
		 */

		row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------");
		/*
		             ***********
		              *********
		               *******
		                *****
		                 ***
		                  *
		
		
		
		
		*/
		for (int i = row; i >= 0; i--) {

			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("#################");
		System.out.println("combine two to make daimond");
		// only change the i=row i>=0;i-- first for loop
		System.out.println();

		row = 5;
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = row; i >= 0; i--) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------");

		/*
		
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
* * * * * *
		 
		 
		 
		 */

		row = 5;
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" " + " ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();

		}

		System.out.println("----------");

/*
		
		*****
		*   *
		*   *
		*   *
		*****
		
*/		
		for (int i = 0; i < row; i++) {

			for (int k = 0; k < row; k++) {
				
				if ((i == 0 || k == 0) || (i == row - 1 || k == row - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		System.out.println("-----------");
/*	
	     *
	    * *
	   *   *
	  *     *
	 *********

*/		
		   for (int i = 1; i <= row; i++) {
	            // Print leading spaces
	            for (int j = row; j > i; j--) {
	                System.out.print(" ");
	            }

	            // Print stars and spaces inside the hollow pyramid
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                if (j == 1 || j == 2 * i - 1 || i == row) {
	                    // Print star at the start, end of the row, or in the last row
	                    System.out.print("*");
	                } else {
	                    // Print space inside the pyramid
	                    System.out.print(" ");
	                }
	            }

	            // Move to the next line
	            System.out.println();
	        }
	System.out.println("------------");
	                              	  /* 
		    
               1 
              1 2 
             1 2 3 
            1 2 3 4 
           1 2 3 4 5 
		   
		   
		                                         */
	row=5;
		   for(int i=0;i<=row;i++) {
			   
			   for(int j=0;j<row-i;j++) {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=i;k++) {
				   System.out.print(k+" ");
			   }
			  System.out.println(); 
		   }
		
		
		
		   
		   
	}
}
