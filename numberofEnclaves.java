package com.company;

public class numberofEnclaves {
    static void dfs(int row, int col, int[] delrow, int[] delcol, int[][] vis, int[][] grid){
        vis[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i<4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if (nrow>=0 && nrow<n && ncol>=0 && ncol<m
                    && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                dfs(nrow, ncol, delrow, delcol, vis, grid);
            }
        }
    }

    static int numEnclaves(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[] delrow = {-1, 0, 0, 1};
        int[] delcol = {0, -1, 1, 0};
        int[][] vis = new int[n][m];

        for (int i = 0; i<n; i++){
            if (grid[i][0] == 1 && vis[i][0] == 0){
                dfs(i,0, delrow, delcol, vis, grid);
            }

            if (grid[i][m-1] == 1 && vis[i][m-1] == 0){
                dfs(i, m-1, delrow, delcol, vis, grid);
            }
        }

        for (int j = 0; j<m; j++){
            if (grid[0][j] == 1 && vis[0][j] == 0){
                dfs(0, j, delrow, delcol, vis, grid);
            }

            if (grid[n-1][j] == 1 && vis[n-1][j] == 0){
                dfs(n-1, j, delrow, delcol, vis, grid);
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (vis[i][j] == 0 && grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
