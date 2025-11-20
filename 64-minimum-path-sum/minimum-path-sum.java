class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i=1; i<n; i++){
            grid[0][i] += grid[0][i-1];
        }

        for(int i=1; i<m; i++){
            grid[i][0] += grid[i-1][0];
        }
        //tabulation
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
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