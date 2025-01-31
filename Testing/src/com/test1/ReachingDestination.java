package com.test1;

public class ReachingDestination {


	   public  static int mintime(int d) {
          double min=0;
            min= Math.ceil((double)d/5);
	      
          return (int)min;
	    }

	    public static void main(String[] args) {
	        int d = 5;
	        System.out.println(mintime(d));
	    }
}
