class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        //tabulation
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0 && obstacleGrid[i][j] == 0) dp[0][0] = 1;
                else {
                    if(obstacleGrid[i][j] == 1) continue;
                    int up = 0;
                    int left = 0;
                    if(i>0) up = dp[i-1][j];
                    if(j>0) left = dp[i][j-1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m-1][n-1];
    }
    //memoization
    // public int func(int i, int j, int[][] dp, int[][] grid){
    //     if(i == 0 && j == 0 && grid[i][j] == 0) return 1;

    //     if(i<0 || j<0) return 0;
    //     if(grid[i][j] == 1) return 0;
    //     if(dp[i][j] != -1) return dp[i][j];
        
    //     int right = func(i-1, j, dp, grid);
    //     int down = func(i, j-1, dp, grid);

    //     return dp[i][j] = right+down;
    // }
}