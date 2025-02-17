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

	
	   
	   // with map and HashMap
//	   class Solution {
//		    public int numTilePossibilities(String tiles) {
//		        if(tiles.length()==1) return 1;
//		         Map<Character, Integer>map=new HashMap<>();
//		         for(char c:tiles.toCharArray()){
//		              map.put(c,map.getOrDefault(c,0)+1);
//		         }
//		         return buildcharFunction(map);          
//		    }
//
//		   public int  buildcharFunction(Map<Character, Integer>map){
//
//
//		         int totalCount=0;
//		         for(char c:map.keySet()){
//		            
//		            if(map.get(c)>0){
//		            totalCount++;
//		           map.put(c,map.get(c)-1);
//		            totalCount+=buildcharFunction(map);
//		            map.put(c,map.get(c)+1);
//
//		            }
//		         }
//		          return totalCount;
//		   }
//		}
	
	public static void main(String[] args) {
		
		System.out.println(numTilePossibilities("AAB")); // Output: 8
	}
}
