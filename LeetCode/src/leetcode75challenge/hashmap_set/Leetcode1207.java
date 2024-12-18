package leetcode75challenge.hashmap_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1207 {

	 public static boolean uniqueOccurrences(int[] arr) {
	        Map<Integer,Integer>map=new HashMap<>();
	        boolean tag= true;
	      for(int i=0;i<arr.length;i++){
	              map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	      }
	      Set<Integer>set=new HashSet<>();
//	         for(Integer i:map.keySet()){
//	             if(!set.add(map.get(i))){
//	                return false;
//	             }
//	         }
	      //this is better
	      for(int i:map.values()){
	             if(!set.add(i)){
	                return false;
	             }
	         }
	       return tag;
	    }
	
	 public static boolean uniqueOccurrencesNew(int[] arr) {
		 Map<Integer,Integer>map=new HashMap<>();
	      for(int i=0;i<arr.length;i++){
	              map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	      }
	      Set<Integer>set=new HashSet<>(map.values());
	      //direct add in set 
	   return set.size()==map.size();   
	 } 

	 
	
	
	public static void main(String[] args) {
//		Input: arr = [1,2,2,1,1,3]
//		Output: true
//	    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1.
//	    No two values have the same number of occurrences
	
	   int arr[]= {1,2,2,1,1,3};
	   
	   System.out.println(uniqueOccurrences(arr));
	   System.out.println(uniqueOccurrencesNew(arr));
	}

}
