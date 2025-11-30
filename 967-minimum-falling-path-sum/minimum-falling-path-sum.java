class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int[] arr : dp){
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int path = func(n-1, i, matrix, dp);
            ans = Math.min(path, ans);
        }
        return ans;
    }
    public int func(int i, int j, int[][] matrix, int[][] dp){
        if(j<0 || j>= matrix.length) return Integer.MAX_VALUE;
        if(i==0) return matrix[0][j]; 
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
        int one = 0, two =0, three =0;
        if(i>0){
            one = func(i-1, j, matrix, dp);
            two = func(i-1, j+1, matrix, dp);
            three = func(i-1, j-1, matrix, dp);
        }
        return dp[i][j] = matrix[i][j] + Math.min(Math.min(one, two), three);
    }
}