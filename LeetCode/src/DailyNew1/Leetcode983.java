package DailyNew1;

public class Leetcode983 {

	
	    public static  int mincostTickets(int[] days, int[] costs) {
	        int lastDay = days[days.length - 1];
	        int firstDay = days[0];
	        int[] dp = new int[lastDay + 1];
	        boolean[] isTravelDay = new boolean[lastDay + 1];
	        
	        for (int day : days) {
	            isTravelDay[day] = true;
	        }
	        
	        for (int i = firstDay; i <= lastDay; i++) {
	            if (!isTravelDay[i]) {
	                dp[i] = dp[i - 1];
	            } else {
	                int oneDayPass = dp[i - 1] + costs[0];
	                int sevenDayPass = dp[Math.max(0, i - 7)] + costs[1];
	                int thirtyDayPass = dp[Math.max(0, i - 30)] + costs[2];
	                dp[i] = Math.min(oneDayPass, Math.min(sevenDayPass, thirtyDayPass));
	            }
	        }
	        
	        return dp[lastDay];
	    }
	
	
	
	
	
	
	public static void main(String[] args) {

//		Input: days = [1,4,6,7,8,20], costs = [2,7,15]
//				Output: 11
		
		int[]days = {1,4,6,7,8,20};
		int[] costs = {2,7,15};
		
		System.out.println(mincostTickets(days, costs));
		
		
		
	}

}
