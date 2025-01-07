package com.company;

import java.util.*;

class triplet {
    int row;
    int col;
    int tm;

    triplet(int _row, int _col, int _tm){
        this.row = _row;
        this.col = _col;
        this.tm = _tm;
    }
}
public class rotOrange {
    static int orangesRotting(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        Queue<triplet> q = new LinkedList<>();
        int[][] vis = new int[n][m];

        int cntFresh = 0; //count for fresh oranges
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (grid[i][j] == 2){
                    q.add(new triplet(i,j,0));
                    vis[i][j] = 2;
                }
                else {
                    vis[i][j] = 0;
                }
                if (grid[i][j] == 1){cntFresh++;}
            }
        }
        int tm = 0;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, -1, 0, +1};
        int cnt = 0;
        while (!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(tm ,t);
            q.remove();
            for (int i = 0; i<4; i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                if (nrow >= 0 && nrow<n && ncol >= 0 && ncol <m
                    && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    q.add(new triplet(nrow, ncol, t + 1));
                    vis[nrow][ncol] = 1;
                }
            }
        }
        // to check after rotting of all oranges that the oranges that were fresh are all rotten or not
        // for this you can keep a count of fresh oranges found initially and
        // a count of all the oranges that were found in the 4 directions that were pushed into the queue.
        if (cnt != cntFresh){
            return -1;
        }
        return tm;
    }
}