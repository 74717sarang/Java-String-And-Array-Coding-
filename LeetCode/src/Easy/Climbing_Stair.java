package Easy;

public class Climbing_Stair {

	//leetcode 70
	//YT lohia
	 public int climbStairs(int n) {
	        int []res=new int[n+1];
	        if(n==1) return 1;
	        res[1]=1;
	        res[2]=2;
	        for(int i=3;i<=n;i++){
	            res[i]=res[i-1]+res[i-2];
	        }
	        return res[n];
	    }
	 
	 
	 public static void main(String[] args) {
	
		 Climbing_Stair obj=new Climbing_Stair();
		 
		 
		 System.out.println(obj.climbStairs(3));  //34
	}
	
	
}
