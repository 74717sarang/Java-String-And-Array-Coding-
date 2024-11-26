package DailyNew1;

public class LeetCode2924 {

	public int findChampion(int n, int[][] edges) {
        int ans = -1;
        int count = 0;
        int[] inDegrees = new int[n];

        for (int[] edge : edges) {
            final int v = edge[1];
            ++inDegrees[v];
        }

        for (int i = 0; i < n; ++i)
            if (inDegrees[i] == 0) {
                ++count;
                ans = i;
            }

        return count > 1 ? -1 : ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Logic:
//			In-degree Calculation: The array inDegrees keeps track of how many edges are directed towards each node.
//			Finding Nodes with Zero In-degree: The loop checks for nodes that do not have any incoming edges (inDegrees[i] == 0).
//			If there is exactly one node with zero in-degree, it is the "champion."
//			If there are multiple nodes with zero in-degree, the method returns -1.
//			
//		Return Value:
//			The method returns the index of the node with zero in-degree if there is exactly one such node.
//			If no such node exists or there are multiple nodes with zero in-degree, it returns -1.
	}

}
