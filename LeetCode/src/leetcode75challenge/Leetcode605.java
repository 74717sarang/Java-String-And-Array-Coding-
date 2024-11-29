package leetcode75challenge;

public class Leetcode605 {

	
//	it work all test case
	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int count = n;
	        for (int i = 0; i < flowerbed.length; i++) {
	            if (flowerbed[i] == 0 &&
	                (i == 0 || flowerbed[i - 1] == 0) &&
	                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
	                flowerbed[i] = 1; // Place a flower
	                count--;
	                if (count == 0) return true; // Early exit if enough flowers are placed
	            }
	        }
	        return count <= 0 ? true : false;
	    }
	
	    
	   public boolean testPlaceFlowers(int[] flowerbed, int n) {
	        int count = n;
	        for (int i = 0; i < flowerbed.length-2; i++) {
	            if (flowerbed[i] == 0 && flowerbed[i+1]==0 ){
	                flowerbed[i+1] = 1; 
	                count--;
	                i++;
	                if (count == 0) return true; // Early exit if enough flowers are placed
	            }
	        }
	        return count <= 0 ? true : false;
	    }
	    
	    
	public static void main(String[] args) {

		int[]flowerbed = {1,0,0,0,1};
		int  n = 1;
		Leetcode605 leetcode605=new Leetcode605();
		System.out.println(leetcode605.canPlaceFlowers(flowerbed, n));
	
		// test only 101 out of 130 testcsae still need some change
		
		System.out.println(leetcode605.testPlaceFlowers(flowerbed, n));

	}

}
