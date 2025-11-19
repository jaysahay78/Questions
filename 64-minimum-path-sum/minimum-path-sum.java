class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return func(m-1, n-1, grid, dp);
    }

    //memoizaton
    public int func(int i, int j, int[][] grid, int[][] dp){
        if(i==0 && j==0) return grid[i][j];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        int left = func(i, j-1, grid, dp);
        int up = func(i-1, j, grid, dp);

        return dp[i][j] = grid[i][j] + Math.min(left, up);
    }
}