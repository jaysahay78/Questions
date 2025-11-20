class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        //tabulation
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int up = Integer.MAX_VALUE, left = Integer.MAX_VALUE;
                if(i==0 && j==0) dp[0][0] = grid[0][0];
                else{
                    if(i>0)up = dp[i-1][j];
                    if(j>0)left = dp[i][j-1];

                    dp[i][j] = grid[i][j] + Math.min(up, left);
                }
            }
        }
        return dp[m-1][n-1];
    }

    //memoizaton
    // public int func(int i, int j, int[][] grid, int[][] dp){
    //     if(i==0 && j==0) return grid[i][j];
    //     if(i<0 || j<0) return Integer.MAX_VALUE;
    //     if(dp[i][j] != -1) return dp[i][j];

    //     int left = func(i, j-1, grid, dp);
    //     int up = func(i-1, j, grid, dp);

    //     return dp[i][j] = grid[i][j] + Math.min(left, up);
    // }
}