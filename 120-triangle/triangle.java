class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] arr : dp){
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        return func(0, 0, triangle, dp);
        // for(int j=0; j<n; j++){
        //     dp[n-1][j] = triangle.get(n-1).get(j);
        // }
        // for(int i=n-2; i>=0; i--){
        //     for(int j=0; j<=i; j++){
        //         int same = dp[i+1][j];
        //         int next = dp[i+1][j+1];

        //         dp[i][j] = triangle.get(i).get(j) + Math.min(same, next);
        //     }
        // }
        // return dp[0][0];
    }
    public int func(int i, int j, List<List<Integer>> list, int[][] dp){
        if(i >= list.size() || j>=i+1) return 0;
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int curr = list.get(i).get(j);
        return dp[i][j] = curr + Math.min(func(i+1, j, list, dp), func(i+1, j+1, list, dp));
    }
}