package DailyNew1;

public class Leetcode1079 {

	    public static int numTilePossibilities(String tiles) {
	        if(tiles.length()==1) return 1;
	         int[]arr=new int[26];
	         for(char c:tiles.toCharArray()){
	              arr[c-'A']++;
	         }
	         return buildcharFunction(arr);          
	    }

	   public static int  buildcharFunction(int[]arr){


	         int totalCount=0;
	         for(int i=0;i<26;i++){
	            
	            if(arr[i]>0){
	            totalCount++;
	            arr[i]--;
	            totalCount+=buildcharFunction(arr);
	            arr[i]++;

	            }
	         }
	          return totalCount;
	   }

	
	
	public static void main(String[] args) {
		
		System.out.println(numTilePossibilities("AAB")); // Output: 8
	}
}
