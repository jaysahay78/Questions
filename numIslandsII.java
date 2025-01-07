package com.company;

import java.util.*;

class pair {
    int first;
    int second;
    public pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

public class numIslandsII {
    public void bfs(int r, int c, int[][] vis, char[][]grid){
        vis[r][c] = 1;
        Queue<pair> q = new LinkedList<pair>();
        q.add(new pair(r, c));
        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            for (int delrow = -1; delrow<=1; delrow++){
                for (int delcol = -1; delcol<=1; delcol++){
                    int nrow = row + delrow;
                    int ncol = col + delcol;
                    if (nrow >= 0 && nrow <n && ncol >= 0 && ncol < m
                    && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0){
                        vis[nrow][ncol] = 1;
                        q.add(new pair(nrow, ncol));
                    }
                }
            }
        }
    }

    public int numIslands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int cnt = 0;

        for (int i =0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (vis[i][j] == 0 && grid[i][j] == 1){
                    cnt++;
                    bfs(i, j,vis, grid);
                }
            }
        }
        return cnt;
    }

    public void main(String[] args) {
        char[][] grd = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        System.out.println(numIslands(grd));
    }
}
