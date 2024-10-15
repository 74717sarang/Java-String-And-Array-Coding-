package Daily;

import java.util.Arrays;

public class DivideIntervalGroup {

	public static int minGroups(int[][] intervals) {
        int len = intervals.length;
        int[][] events = new int[2 * len][2];

        int index = 0;
        for (int[] interval : intervals) {
            events[index++] = new int[] { interval[0], 1 };
            events[index++] = new int[] { interval[1] + 1, -1 };
        }

        Arrays.sort(events, (i, j) -> i[0] == j[0] ? i[1] - j[1] : i[0] - j[0]);

        int maxGroups = 0;
        int currentGroups = 0;

        for (int[] event : events) {
            currentGroups += event[1];
            maxGroups = Math.max(maxGroups, currentGroups);
        }

        return maxGroups;

    }
	
	
	
	public static void main(String[] args) {
		int[][] intervals = { { 5, 10 }, { 6, 8 }, { 1, 5 }, { 2, 3 }, { 1, 10 } };
        System.out.println("length::"+intervals.length); 
//		for(int i=0;i<5;i++) {
//        	 for(int j=0;j<2;j++) {
//            	 System.out.print(intervals[i][j]+" ");
//             }	 
//        	 System.out.println();
//         }
	
        // 2-D Array print
//		for(int [] i:intervals) {
//			for(int e:i) {
//				System.out.println(e);
//			}
//			System.out.println();
//		}
        
        System.out.println("Minimum number of groups: " +DivideIntervalGroup.minGroups(intervals) );  // Output: 3

		
	}
}
